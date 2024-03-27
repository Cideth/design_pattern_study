package com.singleton.samples.multithread;

/**
 * 멀티스레드 환경에서 안전한 싱글톤
 * volatile 키워드를 사용하여, 메모리에서 직접 값을 읽어오는 형식
 */
public class Singleton {
    private static volatile Singleton singleton; // volatile 키워드로 직접 메모리에서 값을 읽어온다.

    private Singleton(){};

    /**
     * synchronized 키워드를 사용하여, 한 번에 하나의 스레드만 내부 코드 블록을 실행할 수 있도록 보장.
     * 이중장금 확인(Double Check Locking)패턴에서의 최적화를 적용하기 위해 tmpSingleton 지역변수를 활용.
     * @return Singleton
     */
    public static Singleton GetInstance(){

        Singleton tmpSingleton = singleton; // 임시 지역변수를 사용하여 cpu 캐시를 사용할 수 있도록 한다.

        if(tmpSingleton != null)
            return tmpSingleton;
        synchronized (Singleton.class){     // 클래스 잠금
            if(singleton == null)
                singleton = new Singleton();
            return singleton;
        }



    }
}
