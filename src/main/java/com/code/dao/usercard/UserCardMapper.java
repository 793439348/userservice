package com.code.dao.usercard;

import com.code.bean.pojo.UserCard;
import com.code.bean.vo.inputobj.AddBankCardVO;
import com.code.bean.vo.outobj.UserBankCardVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 会员银行卡
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface UserCardMapper {

    /*获取银行卡列表*/
    List<UserBankCardVO> getUserCardList(@Param("merchantId") Integer merchantId,
                                         @Param("userId") Integer userId)throws Exception;

    /*添加银行卡列表*/
    int addBankCard(AddBankCardVO addBankCardVO)throws Exception;

    /*根据银行卡id获取卡信息*/
    UserCard getUserCardById(Integer id);
}