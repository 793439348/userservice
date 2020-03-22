package com.code.service.userreport;

import com.code.bean.vo.outobj.UserReportVO;

public interface UserReportService {

    /*个人报表*/
    UserReportVO getUserReport(Integer merchantId, Integer userId, String day) throws Exception;
}
