package com.study.ch02;

public class Variable {
    public static void main(String[] args) {

        int date = 20231229;
        double date2 = (double) date; // 업캐스팅 -> (자료형)생략가능
        int date3 = (int) date2; // 다운캐스팅 -> (자료형)생략불가

        // 문자 -> 정수 -> 실수

        char a = '1';
        int b = a;
        double c = b;
        double d = a;

        //int &a; // a의 주소값
        //주소를 담을 수 있는 변수 = 포인터 변수

        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);
        System.out.println(date + 6);
        System.out.println(date + 7);
        System.out.println(date + 8);
        System.out.println(date + 9);
    }
}