package com.study.ch07.register02;


public class GameService {

    boolean isEmptyString(String str) {
        if(str == null){
            return true;
        }
        return str.isBlank();
    }
    void register02GameService(Game game) {
        GameRepository gameRepository = new GameRepository();

        System.out.println("서비스 까지 데이터 전달함.");

        gameRepository.saveGame(game);


    }
}
