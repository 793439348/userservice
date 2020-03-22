package com.code;

import com.code.bean.vo.inputobj.UserAcclogVO;
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

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserserviceApplicationTests {

    @Autowired
    UserBillMapper userBillMapper;

    @Test
    void contextLoads() throws Exception {
        UserAcclogVO userAcclogVO = new UserAcclogVO();
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
    }

    @Autowired
    UserMsgMapper userMsgMapper;

    @Test
    void test03() throws Exception{
    }

    @Autowired
    UserMapper userMapper;

    @Test
    void test04() throws Exception{
       /* DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        boolean before = LocalDateTime.parse("2020-3-23 00:00:00", dtf).isBefore(LocalDateTime.now());
        System.out.println(before);*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date parse = sdf.parse(sdf.format(new Date()));
        System.out.println( parse.getTime());
        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());
    }

    @Autowired
    UserCardMapper userCardMapper;


    @Test
    void test05() throws Exception{
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(LocalDateTime.parse("2020-03-20 15:43:00", dtf).isAfter(LocalDateTime.now()));

        System.out.println(new BigDecimal(50));

    }


}
