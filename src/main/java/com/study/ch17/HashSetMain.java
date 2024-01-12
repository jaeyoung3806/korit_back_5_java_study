package com.study.ch17;

import com.study.ch13.A;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        ArrayList<String> nameList = new ArrayList<>();
        names.addAll(nameList);
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준일");



        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);

        System.out.println(newNameList.get(1));

        String findName = null;

        for(String name : names){
            if(name.equals("김준삼")){
                findName = name;
                break;
            }





        }

    }
}
