package com.gabguimaraes.learnspringframework.dependencyInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessClass {
    //pede para o framework autoinjetar as dependencias de Dependency1 e Dependency2,
    //que são beans gerenciados pelo framework
    //voce pode usar o @autowired em construtores, setters e fields
    @Autowired
    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;

//    @Autowired
//    public BusinessClass(Dependency1 dep1, Dependency2 dep2) {
//        super();
//        this.dependency1 = dep1;
//        this.dependency2 = dep2;
//    }

    public String toString() {
        return "Using dependency 1: " +
                dependency1.toString() +
                "\nUsing dependency 2: "
                + dependency2.toString();
    }


}

@Component
class Dependency2 {
}

@Component
class Dependency1 {

}

@Configuration
@ComponentScan
class DepInj {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext((DepInj.class))) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class).toString());
        }
    }
}
