package com.code.dao.userreport;

import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.outobj.UserReportVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 个人报表
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Mapper
public interface UserReportMapper {

    UserReportVO getUserReport(@Param("headerVO")HeaderVO headerVO,
                               @Param("day") String day)throws Exception;
}
