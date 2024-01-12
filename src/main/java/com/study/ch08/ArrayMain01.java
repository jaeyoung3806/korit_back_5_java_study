package com.study.ch08;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        //배열
        //new : 생성 (힙 메모리 할당:메모리 공간 대여(동적 메모리 할당))
        //null : 메모리 주소 연결을 단절

        int[] numArray; // 선언

        numArray = new int[3]; // 값(주소) 대입

        System.out.println(numArray);

        System.out.println(numArray[0]);

        numArray[0] = 10;

        System.out.println(numArray[0]);
        numArray[1] = 20;
        numArray[2] = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.print("인덱스: ");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);

    }

}
