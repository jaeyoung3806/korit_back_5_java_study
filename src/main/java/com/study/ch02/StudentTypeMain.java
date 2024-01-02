package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType jaeyoung = new StudentType();  //StudentT
        jaeyoung.name = "이재영";
        jaeyoung.studentYear = 25;
        jaeyoung.address = "부산 서구";

        System.out.println("이름: " + jaeyoung.name);
        System.out.println("나이: " + jaeyoung.studentYear);
        System.out.println("주소: " + jaeyoung.address);

        Person p = jaeyoung;
        StudentType s2 = (StudentType) p;

//        Person 이재영 = new Person();
//        StudentType 이재영학생 = (StudentType) 이재영;

        //Person a = new StudentType();
       //Person a = a;
       // StudentType a2 = (StudentType) a;

    }
}

