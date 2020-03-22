package com.code.service.userreport;

import com.code.bean.vo.outobj.UserReportVO;
import com.code.dao.userreport.UserReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserReportServiceImpl implements UserReportService {
    @Autowired
    private UserReportMapper userReportMapper;

    @Override
    public UserReportVO getUserReport(Integer merchantId, Integer userId, String day) throws Exception {
        UserReportVO userReport = userReportMapper.getUserReport(merchantId,userId, day);
        return userReport;
    }
}
