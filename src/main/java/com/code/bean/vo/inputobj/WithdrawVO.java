package com.code.bean.vo.inputobj;

import com.code.bean.vo.HeaderVO;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 前端输入 - 提现申请VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class WithdrawVO implements Serializable {
    private HeaderVO headerVO;
    private Integer bankCardId; //银行卡id
    private BigDecimal amount; //提现金额
    private String withdrawPwd;//提现密码
}
