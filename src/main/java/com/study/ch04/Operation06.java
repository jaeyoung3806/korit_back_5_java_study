package com.study.ch04;

public class Operation06 {

    public static void main(String[] args) {
        /*
        * << 문제 >>
        *
        * 조건연산자(삼항연산자)
        *
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
        * 결과값들의 자료형이 같아야한다
        * 명령문 사용 불가
        * */


        int iResult = 10 > 2 ? 1111 : 2222;
        String sResult = 10 > 2 ? "1111" : "2222";
        boolean bResult = 10 > 2 ? true : false ;

        String name = "이재영";
        String name2 = new String("이재영");

        System.out.println(name2);
        System.out.println(name2);
        System.out.println("테스트 코드 작성");



    }


}

