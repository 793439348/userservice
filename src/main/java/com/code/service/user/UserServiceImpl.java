package com.code.service.user;

import com.code.bean.vo.inputobj.SetWithdrawPwdVO;
import com.code.bean.vo.inputobj.UserVO;
import com.code.dao.user.UserMapper;
import com.code.util.MD5;
import com.code.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void changeNickName(Integer merchantId, Integer userId, String nikeName) throws Exception {
        UserVO userVO = new UserVO();
        userVO.setUserId(userId);
        userVO.setMerchantId(merchantId);
        userVO.setNikeName(nikeName);

        userMapper.modifyUserInfo(userVO);
    }

    @Override
    public void changeHead(Integer merchantId, Integer userId, String head) throws Exception {
        UserVO userVO = new UserVO();
        userVO.setUserId(userId);
        userVO.setMerchantId(merchantId);
        userVO.setHead(head);

        userMapper.modifyUserInfo(userVO);
    }

    @Override
    public void bindPhone(Integer merchantId, Integer userId, String phone, String code) throws Exception {
        /*判断验证码的有效时间*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String, String> map = redisUtil.getHash("phone:" + phone);
        Date time = sdf.parse(map.get("time"));
        if (map.isEmpty() || time.getTime()<new Date().getTime())
            throw new Exception("绑定(修改)手机失败，验证码已失效");

        UserVO user = new UserVO();
        user.setUserId(userId);
        user.setMerchantId(merchantId);
        user.setPhone(phone);
        userMapper.modifyUserInfo(user);
    }

    @Override
    public void changePwd(Integer merchantId, Integer userId, String oldPwd, String newPwd) throws Exception {
        /*验证原密码*/
        String password = userMapper.getOldPwd(merchantId, userId);

        if (null == password || !password.equals(MD5.upper(MD5.md5(oldPwd))))
            throw new Exception("修改密码失败，原密码错误");

        UserVO user = new UserVO();
        user.setUserId(userId);
        user.setMerchantId(merchantId);
        user.setNewPwd(newPwd);
        userMapper.modifyUserInfo(user);
    }

    @Override
    public void setWithdrawPwd(SetWithdrawPwdVO withdrawPwdVO) throws Exception {
        /*验证手机号*//*
        String phone = userMapper.getPhone(setWithdrawPwdVO.getHeaderVO());
        if (null == phone || !phone.trim().equals(setWithdrawPwdVO.getPhone()))
            throw new Exception("设置提现密码失败,手机号码不正确");*/

        /*判断验证码的有效时间*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String, String> map = redisUtil.getHash("phone:" + withdrawPwdVO.getPhone());
        Date time = sdf.parse(map.get("time"));
        if (map.isEmpty() || time.getTime()<new Date().getTime())
            throw new Exception("绑定(修改)手机失败，验证码已失效");

        UserVO user = new UserVO();
        user.setUserId(withdrawPwdVO.getUserId());
        user.setMerchantId(withdrawPwdVO.getMerchantId());
        /*md5加密*/
        user.setWithdrawPwd(MD5.md5(withdrawPwdVO.getWithdrawPwd()));
        userMapper.modifyUserInfo(user);
    }
}
