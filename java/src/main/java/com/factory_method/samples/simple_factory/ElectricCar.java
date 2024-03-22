package com.factory_method.samples.simple_factory;

public class ElectricCar implements Car{
    @Override
    public void stop() {
        System.out.println("전기가 소모되지 않습니다.");
    }

    @Override
    public void start() {
        System.out.println("전기가 소모됩니다.");
    }
}
