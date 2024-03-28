package com.builder.samples.humanbuilder;

public class Main {
    public static void main(String[] args) {
        HumanBuilder builder =  new HumanBuilder();
        builder.addEye(new HumanEye());
        builder.addEye(new HumanEye());
        builder.addEye(new HumanEye());

        builder.setHairType(HairType.LONG);
        builder.addLeg(new HumanLeg());

        Human h = builder.build();

    }
}
