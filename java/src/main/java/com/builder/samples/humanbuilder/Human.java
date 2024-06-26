package com.builder.samples.humanbuilder;

import java.util.List;

public class Human {
    private List<Leg> legs;
    private List<Eye> eyes;
    private HairType hairType;

    public Human(List<Leg> legs, List<Eye> eyes, HairType hairType) {
        if (legs.size() > 2 || eyes.size() > 2) {
            throw new IllegalArgumentException("다리의 개수 또는 눈의 개수가 잘못 되었습니다.");
        }
        this.legs = legs;
        this.eyes = eyes;
        this.hairType = hairType;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public List<Eye> getEyes() {
        return eyes;
    }

    public void setEyes(List<Eye> eyes) {
        this.eyes = eyes;
    }

    public HairType getHairType() {
        return hairType;
    }

    public void setHairType(HairType hairType) {
        this.hairType = hairType;
    }
}
