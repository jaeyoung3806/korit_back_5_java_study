package com.study.ch06;

public class For01 {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        } // 반복횟수가 중심일 때

        int i = 0;
        while(i < 10) {
            System.out.println("i: " + i);
            i++;
        } // 조건이 중심일 때
    }
}
