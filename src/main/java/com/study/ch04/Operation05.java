package com.study.ch04;

public class Operation05 {

    public static void main(String[] args) {
        /*
        * << 문제 >>
        *
        * int x = 1;
        * int y = 1;
        * x와 y 중 하나라도 값이 0이면 결과는 "오류"
        * 사분면
        * x 양수 이면서 y도 양수 => "1사분면"
        * x 음수 이면서 y도 양수 => "2사분면"
        * x 음수 이면서 y도 음수 => "3사분면"
        * x 양수 이면서 y도 음수 => "4사분면"
        * */

        int x = -1;
        int y = 10;
        boolean step1  = x > 0 && y > 0;
        boolean step2  = x < 0 && y > 0;
        boolean step3  = x < 0 && y < 0;
        boolean step4  = x > 0 && y < 0;

        String Result = step1 == true ? "1사분면"
                : step2 == true ? "2사분면"
                : step3 == true ? "3사분면"
                : step4 == true ? "4사분면" : "오류";
        System.out.println(Result);




    }


}

