package com.code.bean.vo.inputobj;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 前端输入 - 绑定(修改)手机VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserBindPhoneVO implements Serializable {
    private Integer merchantId; // 商户id
    private Integer userId;     // 用户id
    private String phone;       // 手机号
    private String code;        // 验证码
}
