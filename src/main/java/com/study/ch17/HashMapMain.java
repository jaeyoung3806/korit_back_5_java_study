package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("username", "junil");
        map.put("password", "1234");
        map.put("name", "김준dlf");
        map.put("email", "never.com");

        System.out.println(map);
        System.out.println(map.get("email"));



    }
}
