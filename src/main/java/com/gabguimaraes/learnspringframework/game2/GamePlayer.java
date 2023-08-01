package com.gabguimaraes.learnspringframework.game2;

public class GamePlayer {
    private final Game game;

    public GamePlayer(Game game) {
        this.game = game;
    }

    public void playGame() {
        game.play();
    }
}
