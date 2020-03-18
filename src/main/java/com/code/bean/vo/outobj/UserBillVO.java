package com.code.bean.vo.outobj;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 返回前端 - 账单明细VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserBillVO implements Serializable {
    private String billno;
    private Integer type;
    private BigDecimal money;
    private BigDecimal beforeMoney;
    private BigDecimal afterMoney;
    private Date time;
    private String remarks;
}
