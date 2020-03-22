package com.code.service.userwithdraw;

import com.code.bean.vo.inputobj.WithdrawVO;

public interface UserWithdrawService {
    /*提现*/
    void withdraw(WithdrawVO withdrawVO) throws Exception;
}
