package com.bugratohumcu.demo;

import com.bugratohumcu.demo.model.Alien;
import com.bugratohumcu.demo.model.Laptop;
import com.bugratohumcu.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Laptop lap = context.getBean(Laptop.class);
//		LaptopService service = context.getBean(LaptopService.class);
//		service.addLaptop(lap);

		Alien alien = context.getBean(Alien.class);
		alien.coding();



	}

}
