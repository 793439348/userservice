package com.code.bean.dto;

import lombok.Data;

/**
 * <p>
 * 返回前端的数据对象
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-18
 */
@Data
public class Dto<T> {
    private Integer error;   //错误码，0为无错误，具体值参考错误码表
    private String message;  //错误描述
    private T data;          //根据具体消息类型，结构不同

    public static Dto returnDto(Integer error, String message, Object data) {
        Dto dto = new Dto();
        dto.setError(error);
        dto.setMessage(message);
        dto.setData(data);
        return dto;
    }
}
