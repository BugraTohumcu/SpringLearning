package com.bugratohumcu.config;

import com.bugratohumcu.Alien;
import com.bugratohumcu.Desktop;
import com.bugratohumcu.Computer;
import com.bugratohumcu.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.bugratohumcu")
public class AppConfig {

    //Commented code is a manual way to configure the application
    //We Used @ComponentScan and @Component to configure the application

    //----------------------------------------------------------------//

    //You can use name like this, and also you can use the method name
    //@Bean(name = "Desktop")

//    @Bean
//    public Alien alien(Computer computer) { //@Qualifier("desktop")
//        Alien alien = new Alien();
//        alien.setNum(25);
//        alien.setComputer(computer);
//
//        return alien;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }


}
