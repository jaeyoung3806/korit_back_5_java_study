package com.study.ch10;

public abstract class ElectronicDevice {

    /*
    * 1. 추상 클래스 abstract class
    * 2. 인터페이스 interface
    * */
    boolean powerState;

    void setPowerOn(){
        powerState = true;
    }
    void setPowerOff(){
        powerState = false;
    }
    // 추상 메소드 : 인터페이스와 추상클래스 에서만 정의 가능
    abstract void showDeviceState();
}
