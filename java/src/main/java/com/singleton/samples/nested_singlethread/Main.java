package com.singleton.samples.nested_singlethread;

/**
 * 단일 스레드 환경에서 중첩 클래스로 작성된 싱글톤
 * 객체를 두개 만들어, 해당 객체가 동일한 객체인 지 확인.
 */

public class Main {
    public static void main(String[] args) {

        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();
        if(singletonA == singletonB){
            System.out.println("둘의 객체는 같습니다.");
        }else{
            System.out.println("둘의 객체는 다릅니다.");
        }

    }
}
