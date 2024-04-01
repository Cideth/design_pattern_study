package com.strategy.samples.strategy;

/**
 * 전략 패턴 구현을 위한 클라이언트 코드
 * <p>
 *     전략 패턴 :
 *     <br>
 *     전략 패턴 구성 요소 :
 *     <br>
 *     1. 전략 메서드를 가진 전략 객체
 *     <br>
 *     2. 전략 객체를 사용하는 컨텍스트(전략 객체의 사용자 또는 소비자)
 *     <br>
 *     3. 전략 객체를 생성해 컨텍스트에 주입하는 클라이언트(제 3자, 전략 객체 공급자)
 * </p>
 */
public class ClientWithStrategy {
    public static void main(String[] args) {
        Solider solider1 = new Solider();
        // 다양한 전략을 주입
        solider1.runContext(new StrategyBow());

        Solider solider2 = new Solider();
        solider2.runContext(new StrategyGun());



    }
}
