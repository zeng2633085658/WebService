package com.ws.client;

import com.ws.service.HelloService;
import com.ws.service.HelloServiceService;

public class Test {
    public static void main(String[] args) {
        HelloServiceService helloServiceService=new HelloServiceService();
        HelloService helloService=helloServiceService.getHelloServicePort();
        String str=helloService.shello("уехЩ");
        helloService.test();
        System.out.println(str);
    }
}
