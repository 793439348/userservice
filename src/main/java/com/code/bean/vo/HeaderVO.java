package com.code.bean.vo;

import lombok.Data;

/**
 * <p>
 * Http 请求头参数VO
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Data
public class HeaderVO {
    private static final long serialVersionUID = 1L;
    private Integer merchantId;
    private Integer userId;

    public HeaderVO() {
    }

    public HeaderVO(Integer merchantId, Integer userId) {
        this.merchantId = merchantId;
        this.userId = userId;
    }
}
