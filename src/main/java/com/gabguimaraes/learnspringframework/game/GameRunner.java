package com.gabguimaraes.learnspringframework.game;

public class GameRunner {
    GamingConsole game;

    public GameRunner(GamingConsole marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running the game..." + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
