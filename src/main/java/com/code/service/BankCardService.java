package com.code.service;

import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.AddBankCardVO;
import com.code.bean.vo.inputobj.WithdrawVO;

/**
 * <p>
 *  操作银行卡相关的服务
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
public interface BankCardService {
    /*会员提现申请*/
    void withdraw(WithdrawVO withdrawVO) throws Exception;

    /*会员添加银行卡*/
    void addBankCard(AddBankCardVO addBankCardVO) throws Exception;
}
