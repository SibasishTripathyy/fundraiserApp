package com.ngo.fundraiser.exception;

public class ValidationErrorException extends Exception {

    public ValidationErrorException(String message) {
        super(message);
    }
}