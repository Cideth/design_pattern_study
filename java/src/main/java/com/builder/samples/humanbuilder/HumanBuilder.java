package com.builder.samples.humanbuilder;


import java.util.ArrayList;
import java.util.List;

/**
 * 사람 객체를 만들기 위해 사용할 HumanBuilder
 *
 */
public class HumanBuilder implements Builder<HumanBuilder,Human> {
    private final List<Eye> eye = new ArrayList<>();
    private final List<Leg> leg = new ArrayList<>();
    private HairType hairType;

    @Override
    public HumanBuilder setHairType(HairType type) {
        this.hairType = type;
        return this;
    }
    @Override
    public HumanBuilder addEye(Eye eye) {
        if(this.eye.size() >= 2){
            throw new IllegalArgumentException("사람 눈은 2개를 초과 할 수 없습니다.");
        }
        this.eye.add(eye);
        return this;
    }

    @Override
    public HumanBuilder addLeg(Leg leg) {
        if(this.leg.size() >= 2){
            throw new IllegalArgumentException("사람 다리는 2개를 초과 할 수 없습니다.");
        }
        this.leg.add(leg);
        return this;
    }
    public Human build(){
        return new Human(this.leg,this.eye,this.hairType);
    }
}
