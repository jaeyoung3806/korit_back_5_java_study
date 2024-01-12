package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("김준일0");
        arrayService.add("김준일1");
        arrayService.add("김준일2");
        arrayService.add("김준일3");
        arrayService.add("김준일4");


        System.out.println(arrayService.toString());

        System.out.println(arrayService.indexOf("김준일2"));

        arrayService.remove(2);

        System.out.println(arrayService.toString());


    }
}
