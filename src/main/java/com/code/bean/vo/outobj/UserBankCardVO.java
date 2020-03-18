package com.code.bean.vo.outobj;

import java.io.Serializable;

/**
 * <p>
 * 返回前端 - 用户银行卡VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
public class UserBankCardVO implements Serializable {
    private Integer id;
    private String userName;//持卡人
    private String bankName;//银行名
    private String bankCode;//卡号
}
