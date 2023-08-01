package com.gabguimaraes.learnspringframework.game2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    @Bean
    public Game residentEvil() {
        return new ResidentEvil();
    }

    @Bean
    public Game marioBros() {
        return new MarioBros();
    }

    @Bean
    public Game needForSpeed() {
        return new NeedForSpeed();
    }

    @Bean
    public GamePlayer gamePlayer() {
        return new GamePlayer(needForSpeed());
    }
}
