package com.study.ch06;

public class For02 {
    public static void main(String[] args) {
        /*
        * 0, 1, 2, 3, 4
        * */


        for(int i = 0; i < 10; i++) {
            System.out.print(i);
            if(i % 5 != 4){
                System.out.print(", ");
            }
            if(i % 5 == 4){
                System.out.println();
            }

        }

        System.out.println("");

        for(int i = 0; i < 5; i++){
            int rv_1 = 5 - 1 - i;
            System.out.print(rv_1);
            if(rv_1 % 5 != 0){
                System.out.print(", ");
            }

        }

        System.out.println("");
        System.out.println("");


        for(int i = 0; i < 10; i++){
            int rv_1 = 10 - 1 - i;
            System.out.print(rv_1);
            if(rv_1 % 5 != 0){
                System.out.print(", ");
            }
            if(rv_1 % 5 == 0){
                System.out.println("");
            }

        }





//        for(int i = 9; i >= 0 && i < 10; i--) {
//            if(i < 10 && i > 4) {
//                System.out.print(i + ",");
//
//            } else if(i == 4){
//                System.out.println("");
//                System.out.print(i+ ",");
//
//            } else {
//                System.out.print(i + ",");
//            }
//
//        }

    }
}
