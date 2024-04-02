package com.template_callback.samples.template_callback;

/**
 * 템플릿 콜백 패턴 구현을 위한 클라이언트 코드 작성
 * <p>
 *     템플릿 콜백 패턴의 구성 요소 :
 *     <br>
 *     1. 템플릿 메서드 : 템플릿 메서드 패턴과 동일하게 미리 지정된 공통의 로직을 수행
 *     <br>
 *     2. 콜백 메서드 : 템플릿 메서드에 전달되거나 사용될 메서드, 익명함수 또는 람다로 사용됨.
 *     <br>
 *     - 해당 메서드들은 동일한 클래스 내부에 존재할 수도 있고 아닐 수도 있음.
 *     <br>
 *     각 패턴과의 차이점 :
 *     <br>
 *     1. 템플릿 메서드 패턴 : 템플릿 메서드를 제공하는 부분은 동일하나, 실제 템플릿 메서드에서 구현해야할 hook 메서드와 같은 부분을 하위클래스에서
 *     제공하는 것이 아닌, 하위 클래스 없이 익명 함수로 제공 될 수 있음.
 *     <br>
 *     2. 전략 패턴 : 전략 패턴의 경우, 각 알고리즘을 전략으로 캡슐화 하는데 목적이 있음. 팩토리 콜백의 경우 단일 메서드 구조 내에 알고리즘 실행의 특정 지에 동작을 주입하는데 있음.
 * </p>
 */
public class Client {
    public static void main(String[] args) {
        Solider rambo = new Solider();
        rambo.runContext("총 초총");
        System.out.println();
        rambo.runContext("칼! 카카칼");
        System.out.println();
        rambo.runContext("도끼! 도독끼");
    }
}
