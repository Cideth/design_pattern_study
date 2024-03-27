package com.singleton.samples.multithread;

/**
 * 멀티스레드 환경에서 싱글톤
 *
 */
public class Main {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();

    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {


            Singleton singleton = Singleton.GetInstance();
            System.out.println(singleton.hashCode());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.GetInstance();
            System.out.println(singleton.hashCode());
        }
    }


}
