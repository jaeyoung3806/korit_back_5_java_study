package com.study.ch05;

import java.util.Scanner;

public class UserINfoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String adress = null;


        System.out.print("이름: ");
        name = scanner.nextLine();

        System.out.print("나이: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.print("학년: ");
        grade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("주소: ");
        adress = scanner.nextLine();

        /*
         * 이름: 이재영
         * 나이: 26
         * 연락처: 01047633806
         * 학년: 4
         * 주소: 부산 서구 */






    }

}
