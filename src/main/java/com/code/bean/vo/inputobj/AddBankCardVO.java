package com.code.bean.vo.inputobj;

import com.code.bean.vo.HeaderVO;
import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * 前端输入 - 添加银行卡VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class AddBankCardVO implements Serializable {
    private HeaderVO headerVO;
    private String userName;//持卡人
    private Integer bankId;//银行卡列表中的id
    private String bankCode;//卡号
    private String bankPlace;//支行名称
    private String time;

    public String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
