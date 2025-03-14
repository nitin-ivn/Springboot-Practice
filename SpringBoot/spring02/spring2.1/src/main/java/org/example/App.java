package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new  ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) context.getBean("alien");
        // instead of setting age here we will set the value in spring.xml
        // alien.setAge(21);
        System.out.println(alien.getAge());
        alien.code();


        Desktop des = context.getBean(Desktop.class);
    }
}
