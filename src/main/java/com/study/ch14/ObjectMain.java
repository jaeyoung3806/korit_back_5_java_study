package com.study.ch14;

public class ObjectMain {

    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("이재영", "서구");
        ObjectTest objectTest1 = new ObjectTest("이재영", "서구");

        System.out.println(objectTest.equals(objectTest1));
        System.out.println(objectTest == objectTest1);

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class);

        System.out.println(objectTest.hashCode());
        System.out.println(objectTest1.hashCode());





    }
}
