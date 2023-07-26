package com.gabguimaraes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldSpring {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            //configure the things that we want spring to manage @Configuration
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //launch a spring context


    }
}
