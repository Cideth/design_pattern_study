package com.template_callback.samples.template_callback;

/**
 * 전략을 사용할 컨텍스트 클래스인 Solider.
 */
public class Solider {
    /**
     * 템플릿 메서드
     *
     * @param weaponSound
     */
    void runContext(String weaponSound){
        System.out.println("전투 시작");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투 종료");
    }

    /**
     *
     * @param weaponSound
     * @return
     */
    private Strategy executeWeapon(final String weaponSound){
        return () -> System.out.println(weaponSound);
    }
}

