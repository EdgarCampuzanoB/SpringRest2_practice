package com.example.SpringIIPractice.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SCExceptionNotFound extends RuntimeException{
    private int id;
    private String name;
    private String description;

    public SCExceptionNotFound(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public SCExceptionNotFound(String message, int id, String name, String description) {
        super(message);
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public SCExceptionNotFound(String message, Throwable cause, int id, String name, String description) {
        super(message, cause);
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public SCExceptionNotFound(Throwable cause, int id, String name, String description) {
        super(cause);
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public SCExceptionNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int id, String name, String description) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public SCExceptionNotFound() {

    }

}
