package com.example.SpringIIPractice.configuration;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ScExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({SCExceptionNotFound.class})
        protected ResponseEntity<Object> handleNotFound(
                Exception e, WebRequest request){
        return handleExceptionInternal(e,"Customer not found",
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
