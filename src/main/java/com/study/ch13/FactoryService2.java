package com.study.ch13;

import java.util.Scanner;

public class FactoryService2 {

    private Scanner scanner;


    public FactoryService2(Scanner scanner) {
        this.scanner = scanner;

    }

    public void create(){
        System.out.println("2공장에서 차량을 생산 합니다.");
        System.out.print("모델명 입력>>");
        String modelName = scanner.nextLine();

        Factory factory = Factory.getInstance();
        factory.setFactoryName("자동차 생산 공장");
        Car car1 = factory.produce(modelName);
        System.out.println(car1.toString());
    }
}
