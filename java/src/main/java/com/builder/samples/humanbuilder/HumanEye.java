package com.builder.samples.humanbuilder;

public class HumanEye extends Eye{
    private static final String DEFAULT_COLOR = "dark";

    private AlignType type;

    public void setType(AlignType type) {
        this.type = type;
    }

    public AlignType getType() {
        return type;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color == null ? DEFAULT_COLOR : color);
    }

    @Override
    public void setSize(int size) {
        if(size > 10){
            throw new IllegalArgumentException("사이즈는 10을 초과할 수 없습니다.");
        }
        super.setSize(size);
    }

    @Override
    public String toString() {
        return "HumanEye{" +
                "type=" + type +
                ", color='" + super.getColor() + '\'' +
                ", size=" + super.getSize() +
                '}';
    }
}
