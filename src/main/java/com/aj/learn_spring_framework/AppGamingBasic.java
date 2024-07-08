package com.aj.learn_spring_framework;

import com.aj.learn_spring_framework.game.MarioGame;
import com.aj.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main (String[] args) {
        var  game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
