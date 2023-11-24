package com.sch.smp_school.exception;

import com.sch.smp_school.cr.Result;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

//    拦截全局异常
@ExceptionHandler(Exception.class)
public Result handleException(Exception e){
    e.printStackTrace();
    return Result.error(StringUtils.hasLength(e.getMessage())? e.getMessage() : "操作失败");
}
}
