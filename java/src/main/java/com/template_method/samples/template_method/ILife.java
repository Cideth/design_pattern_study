package com.template_method.samples.template_method;

/**
 * 템플릿 클래스를 만들기 위해, default를 포함한 인터페이스를 정의
 */
public interface ILife {
    /**
     * factory method
     */
    default void startStory() {
        System.out.println("생명의 시작");
        born();
        living();
        dead();
    }

    /**
     * 필수적으로 오버라이딩 되어야할 born 메소드
     */
    void born();
    /**
     * 선택적으로 오버라이딩 될 living 메소드 (hook 메소드)
     */
    default void living(){
        System.out.println("살아가는중...");
    }

    /**
     * 필수적으로 오버라이딩 되어야할 dead 메소드
     */
    void dead();

}
