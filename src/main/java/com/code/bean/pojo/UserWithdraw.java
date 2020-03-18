package com.code.bean.pojo;

import java.io.Serializable;
import java.util.*;

import lombok.Data;

/**
 * <p>
 * 会员提现表
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserWithdraw implements Serializable {

    private Integer id;
    /*订单号*/
    private String billno;

    private Integer userId;
    /*伸请金额*/
    private Double money;
    /*申请前帐户余额*/
    private Double beforeMoney;
    /*申请后帐户余额*/
    private Double afterMoney;
    /*实际出款余额*/
    private Double recMoney;
    /*手续费*/
    private Double feeMoney;

    private String time;
    /*订单状态*/
    private Integer status;

    private String infos;

    private String bankName;

    private String bankBranch;

    private String cardName;

    private String cardId;

    private String payBillno;

    private String operatorUser;

    private String operatorTime;

    private String remarks;
    /*锁定状态*/
    private Integer lockStatus;
    /*审核状态*/
    private Integer checkStatus;
    /*打款状态*/
    private Integer remitStatus;
    /*打款类型：1：手动API代付；2手动；3：自动API代付*/
    private Integer payType;
    /*支付通道ID*/
    private Integer paymentChannelId;

    private Integer merchantId;

}
