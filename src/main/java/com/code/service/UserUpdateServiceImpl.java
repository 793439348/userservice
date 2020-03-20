package com.code.service;

import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.ResetPwdVO;
import com.code.bean.vo.inputobj.SetWithdrawPwdVO;
import com.code.bean.vo.inputobj.UserVO;
import com.code.dao.user.UserMapper;
import com.code.util.MD5;
import com.code.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Service
public class UserUpdateServiceImpl implements UserUpdateService {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void changeHead(HeaderVO headerVO, String head) throws Exception {
        UserVO userVO = new UserVO();
        userVO.setHeaderVO(headerVO);
        userVO.setHead(head);

        userMapper.modifyUserInfo(userVO);
    }

    @Override
    public void changeNickName(HeaderVO headerVO, String nikeName) throws Exception {
        UserVO userVO = new UserVO();
        userVO.setHeaderVO(headerVO);
        userVO.setNikeName(nikeName);

        userMapper.modifyUserInfo(userVO);
    }

    @Override
    public void bindPhone(HeaderVO headerVO, String phone, String code) throws Exception {
        /*判断验证码的有效时间*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Map<String, String> map = redisUtil.getHash("phone:" + phone);
        if (map.isEmpty() || LocalDateTime.parse(map.get("time"), dtf).isBefore(LocalDateTime.now()))
            throw new Exception("绑定(修改)手机失败，验证码已失效");

        UserVO user = new UserVO();
        user.setHeaderVO(headerVO);
        user.setPhone(phone);
        userMapper.modifyUserInfo(user);
    }

    @Override
    public void changePwd(HeaderVO headerVO, String oldPwd, String newPwd) throws Exception {
        /*验证原密码*/
        String password = userMapper.getOldPwd(headerVO);

        if (null == password || !password.equals(MD5.upper(MD5.md5(oldPwd))))
            throw new Exception("修改密码失败，原密码错误");

        UserVO user = new UserVO();
        user.setHeaderVO(headerVO);
        user.setNewPwd(newPwd);
        userMapper.modifyUserInfo(user);
    }

    /*@Override
    public void resetPwd(ResetPwdVO resetPwdVO) throws Exception {
    }*/

    @Override
    public void setWithdrawPwd(SetWithdrawPwdVO setWithdrawPwdVO) throws Exception {
        /*验证手机号*//*
        String phone = userMapper.getPhone(setWithdrawPwdVO.getHeaderVO());
        if (null == phone || !phone.trim().equals(setWithdrawPwdVO.getPhone()))
            throw new Exception("设置提现密码失败,手机号码不正确");*/

        /*判断验证码的有效时间*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Map<String, String> map = redisUtil.getHash("phone:" + setWithdrawPwdVO.getPhone());
        if (map.isEmpty() || LocalDateTime.parse(map.get("time"), dtf).isBefore(LocalDateTime.now()))
            throw new Exception("设置提现密码失败，验证码已失效");

        UserVO user = new UserVO();
        user.setHeaderVO(setWithdrawPwdVO.getHeaderVO());
        user.setWithdrawPwd(setWithdrawPwdVO.getWithdrawPwd());
        userMapper.modifyUserInfo(user);
    }
}