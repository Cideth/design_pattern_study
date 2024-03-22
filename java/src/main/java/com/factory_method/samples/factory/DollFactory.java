package com.factory_method.samples.factory;

/**
 * 객체의 생성을 담당할 Factory 지정
 */
public abstract class DollFactory {
    protected Doll doll;
    public Doll getInstance(){
        if(doll == null)
            doll = createInstance();
        return doll;
    };

    /**
     * 하위 클래스에서 각각의 타입별로 제품을 리턴하도록 추상 메소드 정의
     * @return Doll
     */
    protected abstract Doll createInstance();
}
