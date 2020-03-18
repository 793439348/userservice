package com.code.bean.vo.inputobj;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 前端输入 - 添加银行卡VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserAddBankCardVO implements Serializable {
    private String userName;//持卡人
    private Integer bankId;//银行卡列表中的id
    private String bankCode;//卡号
    private String bankPlace;//支行名称
}
