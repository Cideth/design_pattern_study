package com.builder.samples.humanbuilder;

/**
 * 여러가지 눈에 대한 설정을 하기 위해 만들어진 Eye 추상클래스
 */
public abstract class Eye {
    private String color;
    private int size = 0;

    public void setColor(String color){
        this.color = color;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public int getSize() {
        return this.size;
    }

}
