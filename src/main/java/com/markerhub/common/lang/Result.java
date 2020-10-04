package com.markerhub.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private int code; //200是正常 非200为不正常
    private String msg;
    private Object data;

    public static Result success(Object data){
        return  success(200,"成功",data);
    }

    public static Result success(int code,String msg,Object data){
        Result rs = new Result();
        rs.setCode(code);
        rs.setMsg(msg);
        rs.setData(data);
        return rs;
    }

    public static Result fail(String msg){
        return  success(200,msg,null);
    }

    public static Result fail(int code,String msg,Object data){
        Result rs = new Result();
        rs.setCode(code);
        rs.setMsg(msg);
        rs.setData(data);
        return rs;
    }



}
