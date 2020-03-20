package com.code.bean.pojo;

import java.io.Serializable;
import java.util.*;

import lombok.Data;

/**
 * <p>
 * 个人消息
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserMsg implements Serializable {

    private Integer id;
    /*0：普通消息  1：充值消息  2：提现消息*/
    private Integer type;

    private String time;

    private String title;

    private String content;

    private String extra;

    private Integer status;

    private Integer merchantId;

    private Integer userId;

    public UserMsg() {
    }

    public UserMsg(Bulider bulider) {
        this.type = bulider.type;
        this.time = bulider.time;
        this.title = bulider.title;
        this.content = bulider.content;
        this.extra = bulider.extra;
        this.status = bulider.status;
        this.merchantId = bulider.merchantId;
        this.userId = bulider.userId;
    }

    public static class Bulider {
        /*0：普通消息  1：充值消息  2：提现消息*/
        private Integer type;

        private String time;

        private String title;

        private String content;

        private String extra;

        private Integer status;

        private Integer merchantId;

        private Integer userId;

        public Bulider setType(Integer type) {
            this.type = type;
            return this;
        }

        public Bulider setTime(String time) {
            this.time = time;
            return this;
        }

        public Bulider setTitle(String title) {
            this.title = title;
            return this;
        }

        public Bulider setContent(String content) {
            this.content = content;
            return this;
        }

        public Bulider setExtra(String extra) {
            this.extra = extra;
            return this;
        }

        public Bulider setStatus(Integer status) {
            this.status = status;
            return this;
        }

        public Bulider setMerchantId(Integer merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        public Bulider setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public UserMsg build() {
            return new UserMsg(this);
        }
    }
}
