package com.singleton.samples.wrong_multithread;

/***
 * 잘못된 멀티스레드 싱글톤
 */
public class Main {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadA());
        Thread threadBar = new Thread(new ThreadB());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("A");
            System.out.println(singleton.hashCode());
        }
    }
    static class ThreadB implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("B");
            System.out.println(singleton.hashCode());
        }
    }
}
