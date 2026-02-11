package com.everton.first.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RecursoNaoEncontradoException.class)
    public ResponseEntity<Object> handleRecursoNaoEncontrado(RecursoNaoEncontradoException recursoNaoEncontradoException){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp",localDateTime.now());
        body.status // 1:17:00
    }
}
