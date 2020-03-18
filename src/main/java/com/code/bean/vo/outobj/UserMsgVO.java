package com.code.bean.vo.outobj;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 返回前端 - 个人消息VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserMsgVO implements Serializable {
    private Integer type;
    private Date time;
    private String title;
    private String content;
    private String extra;
}
