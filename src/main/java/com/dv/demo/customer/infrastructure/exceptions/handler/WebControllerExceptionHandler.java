package com.dv.demo.customer.infrastructure.exceptions.handler;

import com.dv.demo.customer.infrastructure.exceptions.WebControllerException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class WebControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler(WebControllerException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorInfo customerNotFoundHandler(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        return new ErrorInfo(request.getRequestURL().toString(), ex.getLocalizedMessage());
    }
}
