package com.nitin.demo;

import com.nitin.demo.model.Alien;
import com.nitin.demo.model.Laptop;
import com.nitin.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);


//		Alien alien = context.getBean(Alien.class);
//		alien.code();
//		System.out.println(alien.getAge());
	}

}
