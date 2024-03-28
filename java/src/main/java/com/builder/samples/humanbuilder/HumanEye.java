package com.builder.samples.humanbuilder;

public class HumanEye extends Eye{
    private AlignType type;

    public void setType(AlignType type) {
        this.type = type;
    }

    public AlignType getType() {
        return type;
    }

    @Override
    public void setColor(String color) {
        if(color == null){
            color = "dark";
        }
        this.setColor(color);
    }

    @Override
    public void setSize(int size) {
        if(size > 10){
            throw new IllegalArgumentException("사이즈는 10을 초과할 수 없습니다.");
        }
        this.setSize(size);
    }
}
