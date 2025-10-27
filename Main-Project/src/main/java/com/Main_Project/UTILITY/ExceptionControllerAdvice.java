package com.Main_Project.UTILITY;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    public ResponseEntity<ErrorInfo> generalException(Exception exception) {
ErrorInfo error = new ErrorInfo(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value() , LocalDateTime.now());
  return new ResponseEntity<>(error , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

