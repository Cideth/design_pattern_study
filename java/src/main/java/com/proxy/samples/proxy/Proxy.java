package com.proxy.samples.proxy;

/**
 * 대리자 클래스인 Proxy는 실제 서비스와 같은 메서드를 구현하기위해 인터페이스를 구현하도록한다.
 * <p>
 * 대리자 클래스는 실제 서비스에 대한 참조 변수를 갖는다(합성)
 * </p>
 */
public class Proxy implements IService{
    IService service1;

    @Override
    public String runSomething() {
        // 대리자는 실제 서비스의 메서드 호출 전후에 별도의 로직을 수행할 수도 있다.
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달.");
        // 대리자는 실제 서비스와 같은 이름을 가진 메서드를 호출하고, 그 값을 클라이언트에게 돌려준다.
        service1 = new Service();
        return service1.runSomething();
    }
}
