package com.code.service.usercard;

import com.code.bean.vo.inputobj.AddBankCardVO;
import com.code.bean.vo.outobj.UserBankCardVO;

import java.util.List;

public interface UserCardService {
    /*我的银行卡*/
    List<UserBankCardVO> getUserBankList(Integer merchantId,Integer userId) throws Exception;

    /*添加银行卡*/
    void addBankCard(AddBankCardVO addBankCardVO) throws Exception;
}
