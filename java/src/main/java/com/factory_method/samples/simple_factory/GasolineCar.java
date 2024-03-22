package com.factory_method.samples.simple_factory;

public class GasolineCar implements Car{
    @Override
    public void stop() {
        System.out.println("기름이 소모되지 않습니다.");
    }

    @Override
    public void start() {
        System.out.println("기름이 소모됩니다.");
    }
}
