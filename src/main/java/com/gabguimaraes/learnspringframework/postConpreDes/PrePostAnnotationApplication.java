package com.gabguimaraes.learnspringframework.postConpreDes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }
    @PreDestroy
    public void destroy() {
        System.out.println("I'm done");
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("I'm ready");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext((PrePostAnnotationApplication.class))) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            // System.out.println(context.getBean(ClasB.class).toString());
        }
    }
}