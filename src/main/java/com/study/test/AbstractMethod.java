package com.study.test;

public class AbstractMethod {
}
abstract class Program {
    public abstract void develop();
}
class Java extends Program {
    @Override
    public void develop() {
        System.out.println("자바 프로그램을 개발합니다.");
    }
    public void garbageCollection() {
        System.out.println("메모리를 정리합니다.");
    }
}
class C extends Program {
    @Override
    public void develop() {
        System.out.println("C 프로그램을 개발합니다");
    }

    public void defineStruction(){
        System.out.println("구조체를 정의합니다.");
    }
}
