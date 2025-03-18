package org.example;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop constructor");
    }

    @Override
    public void complie() {
        System.out.println("Compiling in Desktop");
    }
}
