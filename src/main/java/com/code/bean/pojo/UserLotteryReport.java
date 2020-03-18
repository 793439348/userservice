package com.code.bean.pojo;

import java.io.Serializable;
import java.util.*;

import lombok.Data;

/**
 * <p>
 * 个人游戏报表
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserLotteryReport implements Serializable {

    private Integer id;

    private Integer userId;

    private Double transIn;

    private Double transOut;

    private Double spend;

    private Double prize;

    private Double spendReturn;

    private Double proxyReturn;

    private Double cancelOrder;

    private Double activity;

    private Double dividend;

    private Double billingOrder;

    private String time;
    /*红包金额*/
    private Double packet;
    /*充值手续费，平台这边的,主报表是实际的*/
    private Double rechargeFee;

    private Integer merchantId;

}
