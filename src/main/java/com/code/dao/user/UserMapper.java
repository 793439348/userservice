package com.code.dao.user;

import com.code.bean.vo.inputobj.UserVO;
import org.apache.ibatis.annotations.Mapper;

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
    int modifyUserInfo(UserVO user);
}
