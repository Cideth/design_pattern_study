package com.builder.samples.humanbuilder;


/**
 * 사람과 관련된 Builder 인터페이스 정의
 * @param <T1> Builder 객체 자체의 타입을 말합니다.
 * @param <T2> Builder를 통해 생성할 클래스의 타입을 말합니다.
 */
public interface Builder<T1,T2> {

    public T1 setHairType(HairType type);
    public T1 addEye(Eye eye);
    public T1 addLeg(Leg leg);

    public T2 build();

}
