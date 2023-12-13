package com.zergatstage.s04.task2;

public class PasswordExceptionHandler extends RuntimeException{
    PasswordExceptionHandler(String message){
        throw new RuntimeException(message);
    }
}
