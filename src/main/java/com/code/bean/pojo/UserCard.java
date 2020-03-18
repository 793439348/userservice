package com.code.bean.pojo;

import java.io.Serializable;
import java.util.*;
import lombok.Data;

/**
 * <p>
 *  用户银行卡表
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserCard implements Serializable {

    private Integer id;

    private Integer userId;
    /*银行表id*/
    private Integer bankId;
    /*支行名称*/
    private String bankBranch;
    /*持卡人*/
    private String cardName;
    /*卡号*/
    private String cardId;
    /*0：正常状态*/
    private Integer status;

    private String time;

    private String lockTime;

    private Integer isDefault;

    private Integer merchantId;

}
