package com.ws.test;

import com.ws.service.HelloService;

import javax.xml.ws.Endpoint;

public class Test {
    public static void main(String[] args) {
        HelloService helloService=new HelloService();
        Endpoint endpoint=Endpoint.publish("http://127.0.0.1:9900/hello",helloService);
    }
}
