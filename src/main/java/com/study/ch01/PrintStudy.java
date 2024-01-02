package com.study.ch01;

public class PrintStudy {

    public static void main(String[] args) {

        System.out.println("\u0061");
        System.out.println("이" + "재" + "영");
        System.out.println("" + '이' + '재' + '영');
        System.out.println("나이: " + (10 + 20));
        // 0000 0000 -> 1 바이트 -> 256경우의 수
        // 0 1 2 3 4 5 6 7 8 9 a b c d e f
        // ac00 -> 가
        // char자료형 -> 2바이트
    }
}
