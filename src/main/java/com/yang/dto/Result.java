package com.yang.dto;

/**
 * 封装json对象，所有返回结果都使用它
 * @author yang
 */
public class Result<T> {
    //是否成功
    private boolean success;

    //成功时返回的数据
    private T data;

    //错误信息
    private String error;

    public Result(){}

    public Result(boolean success ,T data){
        this.success=success;
        this.data=data;
    }

    public Result(boolean success,String error){
        this.success=success;
        this.error=error;
    }
}
