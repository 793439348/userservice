package com.code.bean.vo.inputobj;

import com.code.bean.vo.HeaderVO;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 前端输入 - 设置提现密码VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class SetWithdrawPwdVO implements Serializable {
    private HeaderVO headerVO;
    private String phone; //手机号
    private String code;//验证码
    private String withdrawPwd;//提现密码
}
