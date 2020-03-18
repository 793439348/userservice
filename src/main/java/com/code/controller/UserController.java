package com.code.controller;

import com.code.bean.dto.Dto;
import com.code.bean.vo.inputobj.UserAcclogVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/report", method = RequestMethod.POST)
    public Dto report(@RequestHeader("merchantId") Integer merchantId,
                      @RequestHeader("userId") Integer userId,
                      @RequestParam("day") String day) {
        log.info("{}\n{}\n{}", merchantId, userId, day);
        return Dto.returnDto(0, "测试", null);
    }

    @RequestMapping(value = "/msg", method = RequestMethod.POST)
    public Dto msg(@RequestHeader("merchantId") Integer merchantId,
                   @RequestHeader("userId") Integer userId,
                   Integer page, Integer pageSize) {
        return null;
    }

    @RequestMapping(value = "/acclog", method = RequestMethod.POST)
    public Dto acclog(@RequestHeader("merchantId") Integer merchantId,
                      @RequestHeader("userId") Integer userId,
            UserAcclogVO userAcclog) {
        log.info("{}", userAcclog);
        return Dto.returnDto(0, "233", null);
    }

    @RequestMapping(value = "/changeNickName", method = RequestMethod.POST)
    public Dto changeNickName() {
        return null;
    }

    @RequestMapping(value = "/bindPhone", method = RequestMethod.POST)
    public Dto bindPhone() {
        return null;
    }

    @RequestMapping(value = "/changePwd", method = RequestMethod.POST)
    public Dto changePwd() {
        return null;
    }

    @RequestMapping(value = "/resetPwd", method = RequestMethod.POST)
    public Dto resetPwd() {
        return null;
    }

    @RequestMapping(value = "/setWithdrawPwd", method = RequestMethod.POST)
    public Dto setWithdrawPwd() {
        return null;
    }

    @RequestMapping(value = "/withdraw", method = RequestMethod.POST)
    public Dto withdraw() {
        return null;
    }

    @RequestMapping(value = "/bankCards", method = RequestMethod.POST)
    public Dto bankCards() {
        return null;
    }

    @RequestMapping(value = "/addBankCard", method = RequestMethod.POST)
    public Dto addBankCard() {
        return null;
    }


}
