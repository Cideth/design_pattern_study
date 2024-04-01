package com.template_method.samples.template_method;

public class Alien implements ILife{
    @Override
    public void born() {
        System.out.println("외계인이 태어났어요");
    }

    @Override
    public void dead() {
        System.out.println("외계인이 죽었어요");
    }
}
