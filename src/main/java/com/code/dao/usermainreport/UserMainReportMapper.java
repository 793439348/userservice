package com.code.dao.usermainreport;

import com.code.bean.pojo.UserMainReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 个人主报表
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface UserMainReportMapper {
    /*查询个人主报表*/
    List<UserMainReport> getUserMainReportList(
            @Param("merchantId") Integer merchantId,
            @Param("userId") Integer userId,
            @Param("day") String day) throws Exception;

}