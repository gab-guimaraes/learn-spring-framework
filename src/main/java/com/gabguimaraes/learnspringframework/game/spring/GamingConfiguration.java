package com.gabguimaraes.learnspringframework.game.spring;

import com.gabguimaraes.learnspringframework.game.GameRunner;
import com.gabguimaraes.learnspringframework.game.GamingConsole;
import com.gabguimaraes.learnspringframework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new MarioGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
