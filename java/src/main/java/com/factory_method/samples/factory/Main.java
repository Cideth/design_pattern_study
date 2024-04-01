package com.factory_method.samples.factory;

/**
 * 팩토리 메서드 구현을 위한 클라이언트 코드
 * <p>
 * 팩토리 메서드 : 오버라이드 된 메서드가 객체를 반환하는 패턴
 * <br>
 * <br>
 * 팩토리 메서드 구조 :
 * <br>
 * 1. 생성 파트 : 생성 파트에서는 실제 생성할 제품의 추상화된 인터페이스 또는 클래스의 타입으로 제품을 반환하는 메소드를 가지고있으며
 * 하위 클래스에서 실제 반환할 객체를 생성하여 반환하는 형식
 * <br>
 * 2. 제품 파트 : 실제 사용될 추상화된 클래스 또는 인터페이스를 상속/구현 할 수 있도록 상위 클래스와, 하위 클래스로 이루어져있으며,
 * 객체 생성 부분을 제외한 코드로 구성
 * </p>
 */
public class Main {
    public static void main(String[] args) {
        Doll kongsoonee = new KongsooneeFactory().getInstance();
        Doll barbie =  new BarbieFactory().getInstance();
        kongsoonee.run();
        barbie.run();
        kongsoonee.walk();
        barbie.walk();
    }
}
