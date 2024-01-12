package com.study.ch07.register02;


public class GameDB {
    void  insertGame(Game game) {
        System.out.println("DB에 Insert 완료");
        System.out.println("Insert 내용");
        System.out.println("name: " + game.name);
        System.out.println("code: " + game.type);
        System.out.println("price: " + game.playTime);
        System.out.println();
    }
}
