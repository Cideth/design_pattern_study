package com.builder.samples.humanbuilder;

import java.util.List;

public class Human {
    private List<Leg> legs;
    private List<Eye> eyes;
    private HairType hairType;

    public Human(List<Leg> legs, List<Eye> eyes, HairType hairType) {
        if(legs.size() > 2 || eyes.size() > 2){
           throw new IllegalArgumentException("다리의 개수 또는 눈의 개수가 잘못 되었습니다.");
        }
        this.legs = legs;
        this.eyes = eyes;
        this.hairType = hairType;
    }
}
