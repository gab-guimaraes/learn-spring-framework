package com.gabguimaraes.learnspringframework.game.spring;

import com.gabguimaraes.learnspringframework.game.GameRunner;
import com.gabguimaraes.learnspringframework.game.GamingConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();

    }
}
