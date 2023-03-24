package com.example.testweb.exception.advice;

import com.example.testweb.dto.response.ErrorResponse;
import com.example.testweb.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ValidationAdvice {
    @ExceptionHandler(value = {BusinessException.class})
    public ResponseEntity<ErrorResponse> handleValidationExceptions(BusinessException ex) {
        log.error("Exception: " + ex.getCode() + " - " + ex.getMessage());
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ErrorResponse response = new ErrorResponse<>(status.value(), ex.getCode(), ex.getMessage());
        return new ResponseEntity<>(response, status);
    }

}
