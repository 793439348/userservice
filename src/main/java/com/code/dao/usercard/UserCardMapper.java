package com.code.dao.usercard;

import com.code.bean.pojo.UserCard;
import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.AddBankCardVO;
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
    List<UserCard> getUserCardList(HeaderVO headerVO)throws Exception;

    /*添加银行卡列表*/
    int addBankCard(AddBankCardVO addBankCardVO)throws Exception;
}