package com.builder.samples.humanbuilder;

public abstract class Eye {
    private String color;
    private int size;

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
