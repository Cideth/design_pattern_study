package com.singleton.samples.singlethread;

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
