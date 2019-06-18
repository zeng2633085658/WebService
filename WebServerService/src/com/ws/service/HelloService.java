package com.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloService {
    @WebMethod
    public String shello(String name){

        return name+"你好!!";
    }
    public void test(){
        System.out.println("测试......");
    }

}
