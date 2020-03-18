package com.code.dao.userlotteryreport;

import com.code.bean.pojo.UserLotteryReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 个人游戏报表
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface UserLotteryReportMapper {
    /*查询个人游戏报表*/
    List<UserLotteryReport> getUserLotteryReportList(@Param("merchantId") Integer merchantId,
                                                     @Param("userId") Integer userId,
                                                     @Param("day") String day) throws Exception;
}