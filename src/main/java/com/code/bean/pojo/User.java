package com.code.bean.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-20
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String imgPassword;

    private String nickname;

    private BigDecimal totalMoney;

    private BigDecimal lotteryMoney;

    private BigDecimal baccaratMoney;

    private BigDecimal freezeMoney;

    private BigDecimal dividendMoney;

    private Integer type;

    private Integer upid;

    private String upids;

    private Integer code;

    private BigDecimal locatePoint;

    private BigDecimal notLocatePoint;

    private Integer codeType;

    private BigDecimal extraPoint;

    private String withdrawName;

    private String withdrawPassword;

    private String registTime;

    private String loginTime;

    private String lockTime;

    private Integer aStatus;

    private Integer bStatus;

    private String message;

    private String sessionId;

    private Integer onlineStatus;

    private Integer allowEqualCode;

    private Integer allowTransfers;

    /**
     * 是否允许平台转账 1允许
     */
    private Integer allowPlatformTransfers;

    /**
     * 是否允许取款 1允许
     */
    private Integer allowWithdraw;

    private Integer loginValidate;

    private Integer bindStatus;

    private Integer vipLevel;

    private BigDecimal integral;

    private String secretKey;

    private Integer isBindGoogle;

    /**
     * 关联上级id
     */
    private Integer relatedUpid;

    /**
     * 关联下级id列表,与related_upid数据是冗余的，这里更方便查询使用
     */
    private String relatedLowers;

    /**
     * 关联上级吃返点百分比
     */
    private BigDecimal relatedPoint;

    /**
     * 关联会员id列表
     */
    private String relatedUsers;

    /**
     * 0：不是超级招商；1：是超级招商
     */
    private Integer isCjZhaoShang;

    private Integer utype;

    private Integer merchantId;

    /**
     * 头像
     */
    private String head;

    private String phone;

}
