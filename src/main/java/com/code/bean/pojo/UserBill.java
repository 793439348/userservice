package com.code.bean.pojo;

import java.io.Serializable;
import java.util.*;
import lombok.Data;

/**
 * <p>
 *  帐变明细
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserBill implements Serializable {

    private Integer id;
    /*单号*/
    private String billno;

    private Integer userId;
    /*1：注帐户*/
    private Integer account;
    /*1：充值  2：取款*/
    private Integer type;

    private Double money;

    private Double beforeMoney;

    private Double afterMoney;

    private Integer refType;

    private String refId;

    private String time;

    private String remarks;

    private Integer merchantId;

}
