package com.aj.learn_spring_framework;

import com.aj.learn_spring_framework.game.GamingConsole;
import com.aj.learn_spring_framework.game.MarioGame;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game: " + game + " is running");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
