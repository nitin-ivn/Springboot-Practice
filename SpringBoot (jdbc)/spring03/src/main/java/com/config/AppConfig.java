package com.config;


import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public Alien Alien(@Qualifier("com1") Computer com){
//        Alien a1 = new Alien();
//        a1.setAge(21);
//        a1.setCom(com);
//        return a1;
//    }
//
//    @Bean(name = "com1")
//    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
