package com.gabguimaraes.learnspringframework.prototypeAndSingleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component //by default all beans are singletons
class NormalClass {

}

@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {


}


@Configuration
@ComponentScan
public class PrototypeAndSing {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext((PrototypeAndSing.class))) {
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            // System.out.println(context.getBean(ClasB.class).toString());
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}