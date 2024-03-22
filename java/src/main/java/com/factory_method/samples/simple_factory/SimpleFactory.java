package com.factory_method.samples.simple_factory;

public class SimpleFactory {
    public Car createCar(CarType type){

        switch (type){
            case ELECTRIC:
                return createElectricCar();
            case GASOLINE:
                return createGasolineCar();
            default:
                throw new IllegalArgumentException("올바르지 않은 타입입니다");
        }
    }
    private Car createElectricCar(){
        return new ElectricCar();
    }
    private Car createGasolineCar(){
        return new GasolineCar();
    }
}
