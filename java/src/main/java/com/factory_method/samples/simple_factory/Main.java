package com.factory_method.samples.simple_factory;

public class Main {
    public static void main(String[] args) {
        Car car =  new SimpleFactory().createCar(CarType.GASOLINE);
        car.start();

    }
}
