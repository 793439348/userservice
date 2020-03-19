package com.code.service;

import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.ResetPwdVO;
import com.code.bean.vo.inputobj.SetWithdrawPwdVO;
import com.code.dao.user.UserMapper;
import com.code.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    }

    @Override
    public void changeNickName(HeaderVO headerVO, String nikeName) throws Exception {

    }

    @Override
    public void bindPhone(HeaderVO headerVO, String phone, String code) throws Exception {

    }

    @Override
    public void changePwd(HeaderVO headerVO, String oldPwd, String newPwd) throws Exception {

    }

    @Override
    public void resetPwd(HeaderVO headerVO, ResetPwdVO resetPwdVO) throws Exception {

    }

    @Override
    public void setWithdrawPwd(HeaderVO headerVO, SetWithdrawPwdVO setWithdrawPwdVO) throws Exception {

    }
}
