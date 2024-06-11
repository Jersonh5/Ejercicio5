package com.example.demo.exceptions;

public class UsuarioNotFoundException extends ResourceNotFoundException{
    public UsuarioNotFoundException() {
    }

    public UsuarioNotFoundException(String message) {
        super(message);
    }

    public UsuarioNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsuarioNotFoundException(Throwable cause) {
        super(cause);
    }

    public UsuarioNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}