package com.code.bean.vo.inputobj;

import com.code.bean.vo.HeaderVO;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 前端输入 - 修改用户数据VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserVO implements Serializable {
    private HeaderVO headerVO;
    private String head;
    private String nikeName;
    private String phone;
    private String code;
    private String newPwd;
    private String withdrawPwd;



}
