package com.gabguimaraes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Address(String street, String city) {
}

@Configuration
public class HelloWorldConfiguration {

    //bean methods are methods that are managed by
    //spring and are responsible for creating and returning an object
    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Joao", 29);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Rua 1", "Cidade 1");
    }

}
