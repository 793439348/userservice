package com.code.bean.pojo;

import java.io.Serializable;
import java.util.*;
import lombok.Data;

/**
 * <p>
 *  个人主报表
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserMainReport implements Serializable {

    private Integer id;

    private Integer userId;

    private Double recharge;
    /*第三方平台收款手续费*/
    private Double receiveFeeMoney;

    private Double withdrawals;

    private Double transIn;

    private Double transOut;

    private Double accountIn;

    private Double accountOut;

    private Double activity;

    private String time;

    private Integer merchantId;

}
