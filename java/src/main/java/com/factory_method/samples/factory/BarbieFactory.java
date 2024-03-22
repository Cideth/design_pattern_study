package com.factory_method.samples.factory;

public class BarbieFactory extends DollFactory{
    @Override
    public Doll createInstance() {
        return new Barbie();
    }
}
