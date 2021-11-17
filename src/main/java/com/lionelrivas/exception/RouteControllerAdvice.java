package com.lionelrivas.exception;

import com.lionelrivas.o.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RouteControllerAdvice {

    @ExceptionHandler(RouteNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse handleRouteNotFound(Exception exception) {
        return new ErrorResponse(exception.getMessage());
    }
}
