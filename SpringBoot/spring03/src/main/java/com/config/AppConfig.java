package com.config;


import org.example.Alien;
import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Alien Alien(){
        return new Alien();
    }
}
