package com.thoughtworks.webapp.service.exception;

public class UserHasExistException extends RuntimeException{
    public UserHasExistException(String message) {
        super(message);
    }
}
