package com.yang.exception;

/**
 * 预约事务异常
 */
public class AppointException extends RuntimeException {
    public AppointException(String message){
        super(message);
    }
    public AppointException(String message ,Throwable cause){
        super(message, cause);
    }
}
