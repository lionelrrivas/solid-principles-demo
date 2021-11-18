package com.lionelrivas.exception;

import com.lionelrivas.d.CustomerError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

public class CustomerControllerAdvice {

    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ResponseBody
    public CustomerError handleCustomerNotFound(HttpServletRequest request, Exception exception) {
        return new CustomerError(exception.getMessage(), request.getRequestURI());
    }
}
