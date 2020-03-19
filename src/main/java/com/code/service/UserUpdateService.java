package com.code.service;

import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.ResetPwdVO;
import com.code.bean.vo.inputobj.SetWithdrawPwdVO;


/**
 * <p>
 * 会员修改信息相关的服务
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
public interface UserUpdateService {
    /*会员头像修改*/
    void changeHead(HeaderVO headerVO, String head) throws Exception;

    /*会员昵称修改*/
    void changeNickName(HeaderVO headerVO,String nikeName) throws Exception;

    /*会员绑定（修改）手机*/
    void bindPhone(HeaderVO headerVO,String phone,String code) throws Exception;

    /*会员修改密码*/
    void changePwd(HeaderVO headerVO,String oldPwd,String newPwd) throws Exception;

    /*会员重置密码*/
    void resetPwd(HeaderVO headerVO, ResetPwdVO resetPwdVO) throws Exception;

    /*会员设置提现密码*/
    void setWithdrawPwd(HeaderVO headerVO, SetWithdrawPwdVO setWithdrawPwdVO) throws Exception;


}
