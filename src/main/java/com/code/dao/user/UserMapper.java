package com.code.dao.user;

import com.code.bean.pojo.User;
import com.code.bean.vo.inputobj.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface UserMapper {

    /*根据参数修改用户表数据*/
    int modifyUserInfo(UserVO user) throws Exception;

    /*获取用户信息*/
    User getUser(@Param("merchantId") Integer merchantId,
                 @Param("userId") Integer userId) throws Exception;

    /*查询原密码*/
    String getOldPwd(@Param("merchantId") Integer merchantId,
                     @Param("userId") Integer userId) throws Exception;

    /*获取手机号*/
    String getPhone(@Param("merchantId") Integer merchantId,
                    @Param("userId") Integer userId) throws Exception;

}
