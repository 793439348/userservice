package com.code.service;

import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.UserAcclogVO;
import com.code.bean.vo.outobj.UserBankCardVO;
import com.code.bean.vo.outobj.UserBillVO;
import com.code.bean.vo.outobj.UserMsgVO;
import com.code.bean.vo.outobj.UserReportVO;

import java.util.List;

/**
 * <p>
 * 会员查询相关的服务
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
public interface UserSelectService {
    /*查询个人报表*/
    UserReportVO getUserReport(HeaderVO headerVO,String day) throws Exception;

    /*查询个人消息*/
    List<UserMsgVO> getUserMsgList(HeaderVO headerVO, Integer page, Integer pageSize) throws Exception;

    /*查询账单明细*/
    List<UserBillVO> getUserAcclogList(UserAcclogVO userAcclog) throws Exception;

    /*查询会员银行卡*/
    List<UserBankCardVO> getUserBankList(HeaderVO headerVO) throws Exception;

}
