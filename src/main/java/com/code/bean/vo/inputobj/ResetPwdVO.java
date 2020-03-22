package com.code.bean.vo.inputobj;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 前端输入 - 重置密码VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Data
public class ResetPwdVO implements Serializable {
    private Integer merchantId;
    private Integer userId;
    private String phone;
    private String code;
    private String newPwd;
}
