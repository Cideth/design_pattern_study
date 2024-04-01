package com.template_method.samples.template_method;

/**
 * 템플릿 메서드 패턴을 구현하기 위한 클라이언트 코드
 * <p>
 * 템플릿 메서드 패턴 : 상위 클래스의 견본 메서드에서 하위 클래스가 오버라이딩한 메서드를 호출하는 행위
 * <br>
 * <br>
 * 템플릿 메서드의 구성요소 :
 * <br>
 * 1. 템플릿 메서드 : 공통 로직을 수행하며, 로직 중 하위 클래스에서 오버라이딩한 추상 메서드 또는 후크 메서드를 호출하는 역할
 * <br>
 * 2. 추상 메서드 : 템플릿 메서드에서 호출될 메서드. 필수적으로 하위 클래스에서 재정의 되어야함.
 * <br>
 * 3. hook 메서드 : 템플릿 메서드에서 호출될 메서드, 선택적으로 하위 클래스에서 재정의 되어야함.
 * </p>
 *
 */
public class ClientWithTemplateMethod {
    public static void main(String[] args) {
        ILife human = new Human();
        ILife alien = new Alien();

        human.startStory();
        alien.startStory();
    }
}
