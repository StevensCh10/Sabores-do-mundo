package com.saboresdomundo.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CannotBeReserve extends RuntimeException{
    
    public CannotBeReserve(String message){
        super(message);
    }
}
