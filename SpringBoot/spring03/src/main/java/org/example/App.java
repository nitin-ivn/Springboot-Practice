package org.example;

import com.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop d1 = context.getBean("com1",Desktop.class);
        d1.complie();

        Alien a1 = context.getBean(Alien.class);
        a1.code();
    }
}
