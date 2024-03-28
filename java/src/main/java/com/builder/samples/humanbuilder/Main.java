package com.builder.samples.humanbuilder;

public class Main {
    public static void main(String[] args) {
        HumanBuilder builder =  new HumanBuilder();
        HumanEye eye1 = new HumanEye();
        HumanEye eye2 = new HumanEye();
        HumanLeg leg1 = new HumanLeg();
        Human human = builder.addEye(eye1)
                .addEye(eye2)
                .addLeg(leg1)
                .setHairType(HairType.LONG)
                .build();
        System.out.println(human.getEyes().get(0).toString());
    }
}
