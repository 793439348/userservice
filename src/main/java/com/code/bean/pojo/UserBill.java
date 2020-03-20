package com.code.bean.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

import lombok.Data;

/**
 * <p>
 * 帐变明细
 * </p>
 *
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

    private BigDecimal money;

    private BigDecimal beforeMoney;

    private BigDecimal afterMoney;

    private Integer refType;

    private String refId;

    private String time;

    private String remarks;

    private Integer merchantId;

    public UserBill() {
    }

    public UserBill(Builder builder) {
        this.id = builder.id;
        this.billno = builder.billno;
        this.userId = builder.userId;
        this.account = builder.account;
        this.type = builder.type;
        this.money = builder.money;
        this.beforeMoney = builder.beforeMoney;
        this.afterMoney = builder.afterMoney;
        this.refType = builder.refType;
        this.refId = builder.refId;
        this.time = builder.time;
        this.remarks = builder.remarks;
        this.merchantId = builder.merchantId;
    }

    public static class Builder {
        private Integer id;
        /*单号*/
        private String billno;

        private Integer userId;
        /*1：注帐户*/
        private Integer account;
        /*1：充值  2：取款*/
        private Integer type;

        private BigDecimal money;

        private BigDecimal beforeMoney;

        private BigDecimal afterMoney;

        private Integer refType;

        private String refId;

        private String time;

        private String remarks;

        private Integer merchantId;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setBillno(String billno) {
            this.billno = billno;
            return this;
        }

        public Builder setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder setAccount(Integer account) {
            this.account = account;
            return this;
        }

        public Builder setType(Integer type) {
            this.type = type;
            return this;
        }

        public Builder setMoney(BigDecimal money) {
            this.money = money;
            return this;
        }

        public Builder setBeforeMoney(BigDecimal beforeMoney) {
            this.beforeMoney = beforeMoney;
            return this;
        }

        public Builder setAfterMoney(BigDecimal afterMoney) {
            this.afterMoney = afterMoney;
            return this;
        }

        public Builder setRefType(Integer refType) {
            this.refType = refType;
            return this;
        }

        public Builder setRefId(String refId) {
            this.refId = refId;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        public Builder setMerchantId(Integer merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        public UserBill build() {
            return new UserBill(this);
        }
    }

}
