package com.code.bean.pojo;

import java.io.Serializable;
import java.util.*;
import lombok.Data;

/**
 * <p>
 *  个人消息
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserMsg implements Serializable {

    private Integer id;
    /*0：普通消息  1：充值消息  2：提现消息*/
    private Integer type;

    private Date time;

    private String title;

    private String content;

    private String extra;

    private Integer status;

    private Integer merchantId;

    private Integer userId;

}
