package com.ngo.fundraiser.exception;

import com.ngo.fundraiser.response.GenericResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.Timestamp;

@ControllerAdvice
public class ExceptionHandlingController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value={IllegalArgumentException.class})
    public ResponseEntity<GenericResponse> handleIllegalArgumentException(IllegalArgumentException e) {
        GenericResponse response = new GenericResponse();
        response.setStatusCode(HttpStatus.BAD_REQUEST.value());
        response.setMessage(e.getMessage());
        response.setTimestamp(new Timestamp(System.currentTimeMillis()));

        return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = { ValidationErrorException.class })
    public ResponseEntity<GenericResponse> handleValidationErrorException(ValidationErrorException e) {
        GenericResponse response = new GenericResponse();
        response.setStatusCode(HttpStatus.UNPROCESSABLE_ENTITY.value());
        response.setMessage(e.getMessage());
        response.setTimestamp(new Timestamp(System.currentTimeMillis()));

        return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GenericResponse> exceptionHandler(Exception ex) {
        GenericResponse response = new GenericResponse();
        response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setMessage(ex.getMessage());
        response.setTimestamp(new Timestamp(System.currentTimeMillis()));

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = { RestrictedAccessException.class })
    public ResponseEntity<GenericResponse> handleRestrictedAccessException(RestrictedAccessException e) {

        GenericResponse response = new GenericResponse();
        response.setStatusCode(HttpStatus.FORBIDDEN.value());
        response.setMessage(e.getMessage());
        response.setTimestamp(new Timestamp(System.currentTimeMillis()));

        return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.FORBIDDEN);
    }
}
