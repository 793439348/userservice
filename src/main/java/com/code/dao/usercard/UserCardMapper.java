package com.code.dao.usercard;

import com.code.bean.pojo.UserCard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface UserCardMapper {

    List<UserCard> getUserCardList()throws Exception;

}