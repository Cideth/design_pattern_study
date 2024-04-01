package com.proxy.samples.proxy;

/**
 * 프록시 패턴 사용을 위한 클라이언트 코드
 * <p>
 * 프록시 패턴 : 제어 흐름을 조정하기 위한 목적으로 중간에 대리자를 두는 패턴.
 * 개방 폐쇄 원칙과, 의존 역전 원칙이 적용된 설계 패턴이라고 볼 수 있음.
 * </p>
 */
public class ClientWidthProxy {
    public static void main(String[] args) {
        // 프록시를 이용한 호출
        IService proxy = new Proxy();
        proxy.runSomething();
        // 원본을 이용한 호출
        IService service = new Service();
        service.runSomething();
    }
}
