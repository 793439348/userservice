package com.code.service.user;

import com.code.bean.vo.inputobj.SetWithdrawPwdVO;

public interface UserService {
    //呢称修改
    void changeNickName(Integer merchantId,Integer userId, String nikeName) throws Exception;

    //头像修改
    void changeHead(Integer merchantId,Integer userId, String head) throws Exception;

    //绑定(修改)手机
    void bindPhone(Integer merchantId,Integer userId, String phone, String code) throws Exception;

    //修改密码
    void changePwd(Integer merchantId,Integer userId, String oldPwd, String newPwd) throws Exception;

    //提现密码
    void setWithdrawPwd(SetWithdrawPwdVO setWithdrawPwdVO) throws Exception;
}
