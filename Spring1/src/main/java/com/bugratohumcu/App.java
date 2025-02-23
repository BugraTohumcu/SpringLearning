package com.bugratohumcu;


import com.bugratohumcu.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {


        //Java based configuration

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien alien = context.getBean(Alien.class);

        System.out.println(alien.getNum());
        alien.getComputer().compile();



        //--------------------------------------------------------//

        //XML based configuration

        //Singleton instance works program started and all the instances refer to the same object
        //Prototype is same with normal object creation
        //You can check the scope in spring.xml

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien alien = context.getBean("alien", Alien.class);
//        alien.coding();
//        System.out.println(alien.getNum());
    }

}
