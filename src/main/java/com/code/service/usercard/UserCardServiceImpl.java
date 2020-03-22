package com.code.service.usercard;

import com.code.bean.vo.inputobj.AddBankCardVO;
import com.code.bean.vo.outobj.UserBankCardVO;
import com.code.dao.usercard.UserCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCardServiceImpl implements UserCardService {
    @Autowired
    private UserCardMapper userCardMapper;

    @Override
    public List<UserBankCardVO> getUserBankList(Integer merchantId, Integer userId) throws Exception {
        List<UserBankCardVO> userCardList = userCardMapper.getUserCardList(merchantId, userId);
        return userCardList;
    }

    @Override
    public void addBankCard(AddBankCardVO addBankCardVO) throws Exception {
        /*判断是否能添加银行卡，注：每个用户最多只能添加5张卡号*/
        List<UserBankCardVO> userCardList = userCardMapper.getUserCardList(addBankCardVO.getMerchantId(), addBankCardVO.getUserId());
        if (userCardList != null && userCardList.size() >= 5) {
            throw new Exception("添加银行卡失败，银行卡持有数量已最大");
        }
        userCardMapper.addBankCard(addBankCardVO);
    }
}
