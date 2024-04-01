package com.decorator.samples.decorator;

public class Service implements IService{
    @Override
    public String runSomething() {
        return "service";
    }
}
