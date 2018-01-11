package com.hnair.provider;

import com.hnair.demo.DubboProvider;

public class DubboProviderImpl implements DubboProvider{

    @Override
    public String sayHello (String name) {
        return "Hello " + name;
    }
}
