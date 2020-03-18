package com.code.bean.vo.inputobj;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 前端输入 - 提现申请VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserWithdrawVO implements Serializable {
    private Integer bankCardId; //银行卡id
    private Integer amount; //提现金额
    private String withdrawPwd;//提现密码
}
