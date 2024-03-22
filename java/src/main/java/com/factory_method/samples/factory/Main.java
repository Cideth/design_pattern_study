package com.factory_method.samples.factory;

public class Main {
    public static void main(String[] args) {
        Doll kongsoonee = new KongsooneeFactory().getInstance();
        Doll barbie =  new BarbieFactory().getInstance();
        kongsoonee.run();
        barbie.run();
        kongsoonee.walk();
        barbie.walk();
    }
}
