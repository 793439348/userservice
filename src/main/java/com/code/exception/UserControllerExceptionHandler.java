package com.code.exception;

import com.code.bean.dto.Dto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 异常处理器
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Slf4j
@ControllerAdvice
public class UserControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Dto unknowException(Exception e) {
        log.error("出现异常：{}", e.getMessage());
        e.printStackTrace();
        return Dto.returnDto(1022, e.getMessage(), null);
    }
}
