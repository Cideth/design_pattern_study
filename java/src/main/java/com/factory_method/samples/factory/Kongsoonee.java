package com.factory_method.samples.factory;

public class Kongsoonee implements Doll{
    @Override
    public void run() {
        System.out.println("콩순이 달린다.");
    }

    @Override
    public void walk() {
        System.out.println("콩순이 걷는다.");
    }

}
