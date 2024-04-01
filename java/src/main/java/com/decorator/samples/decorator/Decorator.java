package com.decorator.samples.decorator;

/**
 * 장식자인 Decorator 클래스는 실제 서비스와 같은 메서드를 구현하기 위해 IService라는 인터페이스를 구현하도록함.
 * 장식자는 실제 서비스에 대한 참조변수 (여기서는 service 필드변수)를 갖는다 (합성)
 */
public class Decorator implements IService{

    private IService service;

    public Decorator() {
        this.service = new Service();
    }

    /**
     * 장식자는 실제 서비스와 같은 메서드를 호출하고 그 반환값에 장식을 더해 반환한다.
     * 또한, 실제 서비스의 메서드 호출 전에 별도의 로직을 수행 할 수도 있다.
     * @return String
     */
    @Override
    public String runSomething() {
        return this.service.runSomething() + " decorator";
    }
}
