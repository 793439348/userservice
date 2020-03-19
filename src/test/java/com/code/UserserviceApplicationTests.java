package com.code;

import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.UserAcclogVO;
import com.code.bean.vo.inputobj.AddBankCardVO;
import com.code.bean.vo.inputobj.UserVO;
import com.code.bean.vo.outobj.UserBillVO;
import com.code.bean.vo.outobj.UserMsgVO;
import com.code.bean.vo.outobj.UserReportVO;
import com.code.dao.user.UserMapper;
import com.code.dao.userbill.UserBillMapper;
import com.code.dao.usercard.UserCardMapper;
import com.code.dao.usermsg.UserMsgMapper;
import com.code.dao.userreport.UserReportMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserserviceApplicationTests {

    @Autowired
    UserBillMapper userBillMapper;

    @Test
    void contextLoads() throws Exception {
        UserAcclogVO userAcclogVO = new UserAcclogVO();
        userAcclogVO.setHeaderVO(new HeaderVO(1,2));
        userAcclogVO.setStartTime("2018-10-07 11:58:19");
        userAcclogVO.setEndTime("2018-10-09 11:58:19");
        userAcclogVO.setPageSize(100);
        userAcclogVO.setPage(0);
        List<UserBillVO> userBillList = userBillMapper.getUserBillList(userAcclogVO);
        userBillList.forEach(userBillVO -> System.out.println(userBillVO));
    }

    @Autowired
    UserReportMapper userReportMapper;

    @Test
    void test02() throws Exception{
        UserReportVO userReport = userReportMapper.getUserReport(new HeaderVO(1, 2), "2018-10-08");
        System.out.println(userReport);
    }

    @Autowired
    UserMsgMapper userMsgMapper;

    @Test
    void test03() throws Exception{
        List<UserMsgVO> userMsgList = userMsgMapper.getUserMsgList(new HeaderVO(1, 2), 0, 10);
        userMsgList.forEach(userMsg -> System.out.println(userMsg));
    }

    @Autowired
    UserMapper userMapper;

    @Test
    void test04() throws Exception{

    }

    @Autowired
    UserCardMapper userCardMapper;

    @Test
    void test05() throws Exception{

    }


}
