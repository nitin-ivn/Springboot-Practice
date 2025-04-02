package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("com2")
@Primary
public class Laptop implements Computer {

    @Override
    public void complie(){
        System.out.println("Compiling in Laptop");
    }
}
