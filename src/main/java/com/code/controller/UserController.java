package com.code.controller;


import com.code.bean.dto.Dto;
import com.code.bean.vo.inputobj.*;
import com.code.bean.vo.outobj.UserBankCardVO;
import com.code.bean.vo.outobj.UserBillVO;
import com.code.bean.vo.outobj.UserMsgVO;
import com.code.bean.vo.outobj.UserReportVO;
import com.code.service.user.UserService;
import com.code.service.userbill.UserBillService;
import com.code.service.usercard.UserCardService;
import com.code.service.usermsg.UserMsgService;
import com.code.service.userreport.UserReportService;
import com.code.service.userwithdraw.UserWithdrawService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 会员服务控制器
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserReportService userReportService;
    @Autowired
    private UserMsgService userMsgService;
    @Autowired
    private UserBillService userBillService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserWithdrawService userWithdrawService;
    @Autowired
    private UserCardService userCardService;

    /**
     * 个人报表
     *
     * @param merchantId
     * @param userId
     * @param day
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/report", method = RequestMethod.POST)
    public Dto report(@RequestHeader("merchantId") Integer merchantId,
                      @RequestHeader("userId") Integer userId,
                      String day) throws Exception {
        UserReportVO userReport = userReportService.getUserReport(merchantId, userId, day);
        return Dto.returnDto(0, null, userReport);
    }

    /**
     * 个人消息
     *
     * @param merchantId
     * @param userId
     * @param page
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/msg", method = RequestMethod.POST)
    public Dto msg(@RequestHeader("merchantId") Integer merchantId,
                   @RequestHeader("userId") Integer userId,
                   Integer page, Integer pageSize) throws Exception {
        List<UserMsgVO> userMsgList = userMsgService.getUserMsgList(merchantId, userId, page, pageSize);
        return Dto.returnDto(0, null, userMsgList);
    }

    /**
     * 帐变明细
     *
     * @param merchantId
     * @param userId
     * @param userAcclogVO
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/acclog", method = RequestMethod.POST)
    public Dto acclog(@RequestHeader("merchantId") Integer merchantId,
                      @RequestHeader("userId") Integer userId,
                      UserAcclogVO userAcclogVO) throws Exception {
        userAcclogVO.setMerchantId(merchantId);
        userAcclogVO.setUserId(userId);
        List<UserBillVO> userAcclogList = userBillService.getUserAcclogList(userAcclogVO);
        return Dto.returnDto(0, null, userAcclogList);
    }

    /**
     * 头像修改
     *
     * @param merchantId
     * @param userId
     * @param head
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/changeHead", method = RequestMethod.POST)
    public Dto changeHead(@RequestHeader("merchantId") Integer merchantId,
                          @RequestHeader("userId") Integer userId,
                          String head) throws Exception {
        userService.changeHead(merchantId, userId, head);
        return Dto.returnDto(0, null, null);
    }

    /**
     * 昵称修改
     *
     * @param merchantId
     * @param userId
     * @param nikeName
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/changeNickName", method = RequestMethod.POST)
    public Dto changeNickName(@RequestHeader("merchantId") Integer merchantId,
                              @RequestHeader("userId") Integer userId,
                              String nikeName) throws Exception {
        userService.changeNickName(merchantId, userId, nikeName);
        return Dto.returnDto(0, null, null);
    }

    /**
     * 绑定(修改)手机
     *
     * @param merchantId
     * @param userId
     * @param phone
     * @param code
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/bindPhone", method = RequestMethod.POST)
    public Dto bindPhone(@RequestHeader("merchantId") Integer merchantId,
                         @RequestHeader("userId") Integer userId,
                         String phone, String code) throws Exception {
        userService.bindPhone(merchantId, userId, phone, code);
        return Dto.returnDto(0, null, null);
    }

    /**
     * 修改密码
     *
     * @param merchantId
     * @param userId
     * @param oldPwd
     * @param newPwd
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/changePwd", method = RequestMethod.POST)
    public Dto changePwd(@RequestHeader("merchantId") Integer merchantId,
                         @RequestHeader("userId") Integer userId,
                         String oldPwd, String newPwd) throws Exception {
        userService.changePwd(merchantId, userId, oldPwd, newPwd);
        return Dto.returnDto(0, null, null);
    }

    /**
     * 设置提现密码
     *
     * @param merchantId
     * @param userId
     * @param setWithdrawPwdVO
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/setWithdrawPwd", method = RequestMethod.POST)
    public Dto setWithdrawPwd(@RequestHeader("merchantId") Integer merchantId,
                              @RequestHeader("userId") Integer userId,
                              SetWithdrawPwdVO setWithdrawPwdVO) throws Exception {
        setWithdrawPwdVO.setMerchantId(merchantId);
        setWithdrawPwdVO.setUserId(userId);
        userService.setWithdrawPwd(setWithdrawPwdVO);
        return Dto.returnDto(0, null, null);
    }

    /**
     * 提现伸请
     *
     * @param merchantId
     * @param userId
     * @param withdrawVO
     * @return
     * @throws Exception
     */
    public Dto withdraw(@RequestHeader("merchantId") Integer merchantId,
                        @RequestHeader("userId") Integer userId,
                        WithdrawVO withdrawVO) throws Exception {
        userWithdrawService.withdraw(withdrawVO);
        return Dto.returnDto(0, null, null);
    }

    /**
     * 银行卡列表
     *
     * @param merchantId
     * @param userId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/bankCards", method = RequestMethod.POST)
    public Dto bankCards(@RequestHeader("merchantId") Integer merchantId,
                         @RequestHeader("userId") Integer userId) throws Exception {
        List<UserBankCardVO> userBankList = userCardService.getUserBankList(merchantId, userId);
        return Dto.returnDto(0, null, userBankList);
    }

    /**
     * 添加银行卡
     *
     * @param merchantId
     * @param userId
     * @param addBankCardVO
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/addBankCard", method = RequestMethod.POST)
    public Dto addBankCard(@RequestHeader("merchantId") Integer merchantId,
                           @RequestHeader("userId") Integer userId,
                           AddBankCardVO addBankCardVO) throws Exception {
        addBankCardVO.setMerchantId(merchantId);
        addBankCardVO.setUserId(userId);
        userCardService.addBankCard(addBankCardVO);
        return Dto.returnDto(0, null, null);
    }


}
