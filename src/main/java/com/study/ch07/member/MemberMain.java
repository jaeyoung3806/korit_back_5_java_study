package com.study.ch07.member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        String selecedtMenu = null;


        while(true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원등록");
            System.out.println("q. 프로그램종료하기");

            System.out.print("메뉴 선택 >>>");
            selecedtMenu = scanner.nextLine();

            if("1".equals(selecedtMenu)){
                boolean responseDate= memberService.addMember();
                if (responseDate) {
                    System.out.println("<<< 회원 등록 완료 >>>");
                } else {
                    System.out.println("<<< 회원 등록 취소");
                }
            } else if ("q".equalsIgnoreCase(selecedtMenu)) {
                break;
            } else {
                System.out.println();
                System.out.println("다시 선택하세요.");
            }
            System.out.println();


        }

        System.out.println();
        System.out.println("<<<<< 프로그램이 종료되었습니다 >>>>>");


    }
}
