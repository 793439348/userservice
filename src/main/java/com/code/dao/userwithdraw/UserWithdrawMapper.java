package com.code.dao.userwithdraw;

import com.code.bean.pojo.UserWithdraw;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 会员提现表
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface UserWithdrawMapper {

    int insertUserWithdraw(UserWithdraw userWithdraw);
}