package com.template_method.samples.template_method;

public class Human implements ILife{
    @Override
    public void born() {
        System.out.println("사람이 태어났어요");
    }

    @Override
    public void dead() {
        System.out.println("사람이 죽었어요");
    }

    /**
     * 선택적인 오버라이딩이 가능한 hook method 오버라이드
     */
    @Override
    public void living(){
        System.out.println("인생을 살아가는 중...");
    }
}
