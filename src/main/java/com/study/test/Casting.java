package com.study.test;


public class Casting {
    public static void main(String[] args) {
        Program[] programs = new Program[2];
        programs[0] = new Java();
        programs[1] = new C();
        Java java = new Java();
        C c = new C();
        for(int i = 0; i < programs.length; i++){
            programs[i].develop();
            if (i == 0){
                java.garbageCollection();
            } else {
                c.defineStruction();
            }

        }

    }
}