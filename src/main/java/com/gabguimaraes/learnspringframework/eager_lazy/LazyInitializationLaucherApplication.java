package com.gabguimaraes.learnspringframework.eager_lazy;

import com.gabguimaraes.learnspringframework.dependencyInj.BusinessClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
class ClasB {
    private ClassA classA;

    public ClasB(ClassA classA ) {
        //Logic
        System.out.println("logic B");
        this.classA = classA;
    }
}

@Configuration
@ComponentScan
class LazyInitializationLaucherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext((LazyInitializationLaucherApplication.class))) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
           // System.out.println(context.getBean(ClasB.class).toString());
        }
    }
}
