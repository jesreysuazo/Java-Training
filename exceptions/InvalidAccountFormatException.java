package com.example.M4_Activity5.exceptions;

public class InvalidAccountFormatException extends RuntimeException {
    public InvalidAccountFormatException(String message) {
        super(message);
    }
}
