package com.code.bean.vo.inputobj;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 前端输入 - 获取帐变明细VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class UserAcclogVO implements Serializable {
    private Integer merchantId;
    private Integer userId;
    private String startTime;   // 查询开始日期
    private String endTime;     // 查询结束日期
    private Integer type;       // 类别（空则全部）
    private Integer page;       // 第几页
    private Integer pageSize;   // 每页条数
}
