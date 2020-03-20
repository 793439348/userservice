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

    public UserWithdraw() {
    }

    public UserWithdraw(Builder builder) {
        this.billno = builder.billno;
        this.userId = builder.userId;
        this.money = builder.money;
        this.beforeMoney = builder.beforeMoney;
        this.afterMoney = builder.afterMoney;
        this.recMoney = builder.recMoney;
        this.time = builder.time;
        this.infos = builder.infos;
        this.bankName = builder.bankName;
        this.bankBranch = builder.bankBranch;
        this.cardName = builder.cardName;
        this.cardId = builder.cardId;
        this.operatorUser = builder.operatorUser;
        this.operatorTime = builder.operatorTime;
        this.lockStatus = builder.lockStatus;
        this.checkStatus = builder.checkStatus;
        this.remitStatus = builder.remitStatus;
        this.merchantId = builder.merchantId;
    }

    public static class Builder {
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
        private String time;
        private String infos;
        private String bankName;
        private String bankBranch;
        private String cardName;
        private String cardId;
        private String operatorUser;
        private String operatorTime;
        /*锁定状态*/
        private Integer lockStatus;
        /*审核状态*/
        private Integer checkStatus;
        /*打款状态*/
        private Integer remitStatus;
        private Integer merchantId;

        public Builder setBillno(String billno) {
            this.billno = billno;
            return this;
        }

        public Builder setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder setMoney(Double money) {
            this.money = money;
            return this;
        }

        public Builder setBeforeMoney(Double beforeMoney) {
            this.beforeMoney = beforeMoney;
            return this;
        }

        public Builder setAfterMoney(Double afterMoney) {
            this.afterMoney = afterMoney;
            return this;
        }

        public Builder setRecMoney(Double recMoney) {
            this.recMoney = recMoney;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setInfos(String infos) {
            this.infos = infos;
            return this;
        }

        public Builder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder setBankBranch(String bankBranch) {
            this.bankBranch = bankBranch;
            return this;
        }

        public Builder setCardName(String cardName) {
            this.cardName = cardName;
            return this;
        }

        public Builder setCardId(String cardId) {
            this.cardId = cardId;
            return this;
        }

        public Builder setOperatorUser(String operatorUser) {
            this.operatorUser = operatorUser;
            return this;
        }

        public Builder setOperatorTime(String operatorTime) {
            this.operatorTime = operatorTime;
            return this;
        }

        public Builder setLockStatus(Integer lockStatus) {
            this.lockStatus = lockStatus;
            return this;
        }

        public Builder setCheckStatus(Integer checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }

        public Builder setRemitStatus(Integer remitStatus) {
            this.remitStatus = remitStatus;
            return this;
        }

        public Builder setMerchantId(Integer merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        public UserWithdraw build() {
            return new UserWithdraw(this);
        }
    }

}
