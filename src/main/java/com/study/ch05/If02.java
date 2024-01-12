package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.print("x와 y를 입력해 주세요: ");
        x = scanner.nextInt();
        scanner.nextLine();
        y = scanner.nextInt();




        if(x > 0) {
            if(y > 0) {
                System.out.println("(x,y)는 1사분면");
            } else if(y < 0)
                System.out.println("(x,y)는 4사분면");

        }
        if(x < 0) {
            if(y > 0) {
                System.out.println("(x,y)는 2사분면");
            } else if(y < 0) {
                System.out.println("(x,y)는 3사분면");
            }
        }

        if(x == 0 || y == 0) {
            System.out.println("오류");
        } else if (x > 0 && y > 0) {
            System.out.println("(x,y)는 1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("(x,y)는 2사분면");
        }else if (x < 0 && y < 0) {
            System.out.println("(x,y)는 3사분면");
        }else if (x > 0 && y < 0) {
            System.out.println("(x,y)는 4사분면");
        }


    }
}
