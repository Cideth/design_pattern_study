package com.factory_method.samples.factory;

public class KongsooneeFactory extends DollFactory{
    @Override
    public Doll createInstance() {
        return new Kongsoonee();
    }
}
