package com.study.ch07.register02;

public class GameRepository {

    void saveGame(Game game) {
        GameDB gameDB = new GameDB();
        gameDB.insertGame(game);


    }
}
