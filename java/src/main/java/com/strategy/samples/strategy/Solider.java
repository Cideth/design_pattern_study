package com.strategy.samples.strategy;

/**
 * 전략 객체를 사용하는 컨텍스트 클래스인 Solider를 구현
 */
public class Solider {

    void runContext(Strategy strategy){
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 끝");
    }


}
