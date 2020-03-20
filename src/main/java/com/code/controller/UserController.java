package com.code.controller;

import com.code.bean.dto.Dto;
import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.*;
import com.code.bean.vo.outobj.UserBankCardVO;
import com.code.bean.vo.outobj.UserBillVO;
import com.code.bean.vo.outobj.UserMsgVO;
import com.code.bean.vo.outobj.UserReportVO;
import com.code.service.BankCardService;
import com.code.service.UserSelectService;
import com.code.service.UserUpdateService;
import io.swagger.annotations.ApiImplicitParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private BankCardService bankCardService;
    @Autowired
    private UserSelectService userSelectService;
    @Autowired
    private UserUpdateService userUpdateService;

    @ApiImplicitParam(name = "day", value = "查询日期", required = true, paramType = "query")
    @RequestMapping(value = "/report", method = RequestMethod.POST)
    public Dto report(@RequestHeader("merchantId") Integer merchantId,
                      @RequestHeader("userId") Integer userId,
                      String day) throws Exception {
        UserReportVO userReport = userSelectService.getUserReport(new HeaderVO(merchantId, userId), day);
        return Dto.returnDto(0, null, userReport);
    }

    @RequestMapping(value = "/msg", method = RequestMethod.POST)
    public Dto msg(@RequestHeader("merchantId") Integer merchantId,
                   @RequestHeader("userId") Integer userId,
                   Integer page, Integer pageSize) throws Exception {
        List<UserMsgVO> userMsgList = userSelectService.getUserMsgList(new HeaderVO(merchantId, userId), page, pageSize);
        return Dto.returnDto(0, null, userMsgList);
    }

    @RequestMapping(value = "/acclog", method = RequestMethod.POST)
    public Dto acclog(@RequestHeader("merchantId") Integer merchantId,
                      @RequestHeader("userId") Integer userId,
                      UserAcclogVO userAcclog) throws Exception {
        userAcclog.setHeaderVO(new HeaderVO(merchantId, userId));
        List<UserBillVO> userAcclogList = userSelectService.getUserAcclogList(userAcclog);
        return Dto.returnDto(0, null, userAcclogList);
    }

    @RequestMapping("/changeHead")
    public Dto changeHead(@RequestHeader("merchantId") Integer merchantId,
                          @RequestHeader("userId") Integer userId,
                          String head) throws Exception {
        userUpdateService.changeHead(new HeaderVO(merchantId,userId),head);
        return Dto.returnDto(0, null, null);
    }


    @RequestMapping(value = "/changeNickName", method = RequestMethod.POST)
    public Dto changeNickName(@RequestHeader("merchantId") Integer merchantId,
                              @RequestHeader("userId") Integer userId,
                              String nickName) throws Exception {
        userUpdateService.changeNickName(new HeaderVO(merchantId, userId), nickName);
        return Dto.returnDto(0, null, null);
    }

    @RequestMapping(value = "/bindPhone", method = RequestMethod.POST)
    public Dto bindPhone(@RequestHeader("merchantId") Integer merchantId,
                         @RequestHeader("userId") Integer userId,
                         String phone, String code) throws Exception {
        userUpdateService.bindPhone(new HeaderVO(merchantId, userId), phone, code);
        return Dto.returnDto(0, null, null);
    }

    @RequestMapping(value = "/changePwd", method = RequestMethod.POST)
    public Dto changePwd(@RequestHeader("merchantId") Integer merchantId,
                         @RequestHeader("userId") Integer userId,
                         String oldPwd, String newPwd) throws Exception {
        userUpdateService.changePwd(new HeaderVO(merchantId, userId), oldPwd, newPwd);
        return Dto.returnDto(0, null, null);
    }

    /*@RequestMapping(value = "/resetPwd", method = RequestMethod.POST)
    public Dto resetPwd(@RequestHeader("merchantId") Integer merchantId,
                        @RequestHeader("userId") Integer userId,
                        ResetPwdVO resetPwdVO) throws Exception {
        userUpdateService.resetPwd(new HeaderVO(merchantId, userId), resetPwdVO);
        return Dto.returnDto(0, null, null);
    }*/

    @RequestMapping(value = "/setWithdrawPwd", method = RequestMethod.POST)
    public Dto setWithdrawPwd(@RequestHeader("merchantId") Integer merchantId,
                              @RequestHeader("userId") Integer userId,
                              SetWithdrawPwdVO setWithdrawPwdVO) throws Exception {
        setWithdrawPwdVO.setHeaderVO(new HeaderVO(merchantId, userId));
        userUpdateService.setWithdrawPwd(setWithdrawPwdVO);
        return Dto.returnDto(0, null, null);
    }

    @RequestMapping(value = "/withdraw", method = RequestMethod.POST)
    public Dto withdraw(@RequestHeader("merchantId") Integer merchantId,
                        @RequestHeader("userId") Integer userId,
                        WithdrawVO withdrawVO) throws Exception {
        bankCardService.withdraw(withdrawVO);
        return Dto.returnDto(0, null, null);
    }

    @RequestMapping(value = "/bankCards", method = RequestMethod.POST)
    public Dto bankCards(@RequestHeader("merchantId") Integer merchantId,
                         @RequestHeader("userId") Integer userId) throws Exception {
        List<UserBankCardVO> userBankList = userSelectService.getUserBankList(new HeaderVO(merchantId, userId));
        return Dto.returnDto(0, null, userBankList);
    }


    @RequestMapping(value = "/addBankCard", method = RequestMethod.POST)
    public Dto addBankCard(@RequestHeader("merchantId") Integer merchantId,
                           @RequestHeader("userId") Integer userId,
                           AddBankCardVO addBankCardVO) throws Exception {
        addBankCardVO.setHeaderVO(new HeaderVO(merchantId, userId));
        bankCardService.addBankCard(addBankCardVO);
        return Dto.returnDto(0, null, null);
    }


}
