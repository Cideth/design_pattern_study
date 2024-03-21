package com.singleton.samples.singlethread;

/***
 * 단일 스레드 환경에서 싱글톤
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
