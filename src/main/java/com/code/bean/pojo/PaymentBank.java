package com.code.bean.pojo;

import java.io.Serializable;
import java.util.*;
import lombok.Data;

/**
 * <p>
 *  银行表
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class PaymentBank implements Serializable {

    private Integer id;

    private String name;

    private String url;

    private Integer wStatus;

    private String wMessage;

}
