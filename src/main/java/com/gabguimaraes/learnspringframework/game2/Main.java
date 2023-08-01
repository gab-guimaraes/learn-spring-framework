package com.gabguimaraes.learnspringframework.game2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        GamePlayer gamePlayer = context.getBean(GamePlayer.class);
        gamePlayer.playGame();
    }
}
