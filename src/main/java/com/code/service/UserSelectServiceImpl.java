package com.code.service;

import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.UserAcclogVO;
import com.code.bean.vo.outobj.UserBankCardVO;
import com.code.bean.vo.outobj.UserBillVO;
import com.code.bean.vo.outobj.UserMsgVO;
import com.code.bean.vo.outobj.UserReportVO;
import com.code.dao.userbill.UserBillMapper;
import com.code.dao.usercard.UserCardMapper;
import com.code.dao.usermsg.UserMsgMapper;
import com.code.dao.userreport.UserReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Service
public class UserSelectServiceImpl implements UserSelectService {
    @Autowired
    private UserReportMapper userReportMapper;

    @Autowired
    private UserMsgMapper userMsgMapper;

    @Autowired
    private UserBillMapper userBillMapper;


    @Autowired
    private UserCardMapper userCardMapper;


    @Override
    public UserReportVO getUserReport(HeaderVO headerVO, String day) throws Exception {
        return null;
    }

    @Override
    public List<UserMsgVO> getUserMsgList(HeaderVO headerVO, Integer page, Integer pageSize) throws Exception {
        return null;
    }

    @Override
    public List<UserBillVO> getUserAcclogList(UserAcclogVO userAcclog) throws Exception {
        return null;
    }

    @Override
    public List<UserBankCardVO> getUserBankList(HeaderVO headerVO) throws Exception {
        return null;
    }
}
