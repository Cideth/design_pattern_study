package com.singleton.samples.singlethread;

/**
 * 싱글톤 클래스
 * 내부에서는 단순히 정적 필드 변수가 null인지 체크 한 뒤 없을 경우, 새로 생성하는 구조
 * 생성 이후에는 인스턴스를 여러번 가져오더라도 동일한 객체를 반환
 */
public class Singleton {
    private static Singleton singleton; // 정적인 필드가 필요.

    private Singleton(){    // 공개되지 않는 생성자 필요.

    };
    public static Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}
