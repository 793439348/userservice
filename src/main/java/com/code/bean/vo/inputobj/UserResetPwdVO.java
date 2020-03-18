package com.code.bean.vo.inputobj;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 前端输入 - 重置密码VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserResetPwdVO implements Serializable {
    private String phone;
    private String code;
    private String newPwd;
}
