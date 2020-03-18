package com.code.bean.vo.outobj;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 返回前端 - 个人报表VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserReportVO implements Serializable {
    private String totalBet;    // billing_order
    private String totalWin;    // prize
    private String totalRecharge;   // recharge
    private String totalWithdrawal; // withdrawals

}
