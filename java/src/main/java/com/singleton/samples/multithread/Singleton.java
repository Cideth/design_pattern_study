package com.singleton.samples.multithread;

public class Singleton {
    private static volatile Singleton singleton; // volatile 키워드로 직접 메모리에서 값을 읽어온다.

    private Singleton(){};

    public static Singleton GetInstance(){

        Singleton tmpSingleton = singleton; // 임시 지역변수를 사용하여 cpu 캐시를 사용할 수 있도록 한다.

        if(tmpSingleton != null)
            return tmpSingleton;
        synchronized (Singleton.class){
            if(singleton == null)
                singleton = new Singleton();
            return singleton;
        }



    }
}
