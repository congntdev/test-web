package com.example.testweb.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class Response<T> {
    T data;
    int status = HttpStatus.OK.value();
    String errorCode;
    String errorMessage;

    public Response() {
    }

    public Response(T data) {
        this.data = data;
    }

    public Response(int status, String errorCode, String errorMessage) {
        super();
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
