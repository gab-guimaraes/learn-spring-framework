package com.gabguimaraes.learnspringframework.game;

import com.gabguimaraes.learnspringframework.game.GameRunner;
import com.gabguimaraes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();
        //a classe é criada
        var superContra = new SuperContraGame();
        //injeta a classe criada, pois game runner
        //depende de uma classe que implementa a interface GamingConsole
        var gameRunner = new GameRunner(superContra);
        gameRunner.run();

    }
}
