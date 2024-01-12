package com.study.ch07.register02;

import javax.swing.*;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        GameService gameService = new GameService();


        Scanner scanner = new Scanner(System.in);
        String gameName = null;
        String gameType = null;
        long gamePlayTime = 0;

        System.out.println("게임 등록");

        System.out.print("게임명>>>");
        gameName = scanner.nextLine();
        if(gameService.isEmptyString(gameName)){
            System.out.println("게임명을 다시 입력하세요");
            return;
        }

        System.out.print("게임코드>>>>");
        gameType = scanner.nextLine();
        if(gameService.isEmptyString(gameType)) {
            System.out.println("게임코드를 다시 입력하세요");
            return;
        }

        System.out.print("플레이시간>>>");
        gamePlayTime = scanner.nextLong();

        Game game = new Game(gameName, gameType, gamePlayTime);

        gameService.register02GameService(game);
    }
}
