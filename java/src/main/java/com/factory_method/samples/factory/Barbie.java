package com.factory_method.samples.factory;

public class Barbie implements Doll{
    @Override
    public void run() {
        System.out.println("바비 달린다.");
    }

    @Override
    public void walk() {
        System.out.println("바비 걷는다.");
    }
}
