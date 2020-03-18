package com.code.dao.usermsg;

import com.code.bean.pojo.UserMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 个人消息
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface UserMsgMapper {

    /*分页查询个人消息*/
    List<UserMsg> getUserMsgList(
            @Param("merchantId") Integer merchantId,
            @Param("userId") Integer userId,
            @Param("page") Integer page,
            @Param("pageSize") Integer pageSize
    ) throws Exception;

}