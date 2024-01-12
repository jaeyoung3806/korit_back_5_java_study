package com.study.ch13;

import com.study.ch02.StudentType;

import java.util.Scanner;

public class FactoryService1 {

    private Scanner scanner;

    public FactoryService1(Scanner scanner, Factory factory) {
        this.scanner = scanner;
    }

    public FactoryService1(Scanner scanner) {
    }

    public void create(){
        System.out.println("1공장에서 차량을 생산 합니다.");
        System.out.print("모델명 입력>>");
        String modelName = scanner.nextLine();
        Factory factory = Factory.getInstance();

        factory.setFactoryName("자동차 생산 공장");
        Car car1 = factory.produce(modelName);
        System.out.println(car1.toString());

    }
}
