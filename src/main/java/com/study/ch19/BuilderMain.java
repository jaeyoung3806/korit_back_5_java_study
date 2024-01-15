package com.study.ch19;


public class BuilderMain {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = Car.builder();
        Car car = Car.builder()
                .model("aaa")
                .build();
        System.out.println(car);

        Student.StudentBuilder studentBuilder = Student.builder();
        Student students = Student.builder()
                .name("이재영")
                .address("부산서구")
                .age(26)
                .build();
        System.out.println(students);

        Member member = Member.builder()
                .phone("01047633806")
                .name("김준일")
                .build();
        System.out.println(member);

    }

}
