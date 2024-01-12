package com.study.ch10;
// 인터페이스는 기본적으로 전부 추상 메소드
// 변수 선언이 불가능 하다.
// 상수 선언만 가능
public interface Power {
    String ERROR_CODE = "-9999";
    void setPowerOn();
    void setPowerOff();

    default void test() {
        //안붙이면 추상메소드, default를 추가하면 일반 메소드

    }

}
