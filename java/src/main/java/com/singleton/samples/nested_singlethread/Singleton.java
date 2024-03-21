package com.singleton.samples.nested_singlethread;

/**
 * 중첩 클래스를 통한 싱글톤 구현
 * 정적 이너 클래스는 호출 시점에 초기화 되므로 getInstance를 최초 호출시 내부 필드가 초기화된다.
 */
public class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}
