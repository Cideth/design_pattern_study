package com.proxy.samples.proxy;

public class Service implements IService{
    @Override
    public String runSomething() {
        return "service";
    }
}
