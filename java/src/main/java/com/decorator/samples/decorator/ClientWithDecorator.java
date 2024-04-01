package com.decorator.samples.decorator;

/**
 * 데코레이터 패턴 구현을 위한 클라이언트 코드
 * <p>
 * 데코레이터 패턴 : 메서드 호출의 반환값에 변화를 주기 위해 중간에 장식자를 두는 패턴.
 * 프록시 패턴과 동일한 구조를 갖기에 개방 폐쇄 원칙과, 의존 역전 원칙이 적용된 설계 패턴.
 * </p>
 * <p>
 * 프록시와의 차이점은 프록시는 동일한 결과를 반환한다는것, 데코레이터는 반환값에 추가적인 장식이 달린다는 것으로 보인다.
 * 구현 시, 구조는 동일하다.
 * </p>
 */
public class ClientWithDecorator {
    public static void main(String[] args) {
        IService decorator = new Decorator();
        System.out.println(decorator.runSomething());
    }
}
