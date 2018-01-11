package com.hnair.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main (String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/sample-provider.xml"});
        context.start();
        System.out.println("服务注册成功");
        System.in.read();
    }
}
