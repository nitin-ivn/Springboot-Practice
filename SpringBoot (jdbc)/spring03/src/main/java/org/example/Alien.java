package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
@Scope("prototype")
public class Alien {

    @Value("21")
    private int age;

//    @Autowired
//    @Qualifier("laptop") //default class name in lowercase

    @Autowired
    @Qualifier("com2")
    private Computer com;

    public Alien(){
        System.out.println("Alien");
    }

    @ConstructorProperties({"age","com"})
    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.complie();
    }
}

