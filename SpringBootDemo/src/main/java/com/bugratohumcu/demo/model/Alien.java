package com.bugratohumcu.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("20")
    int age;

    /*If you add dependencies with constructor spring will automatically
    handle the dependency injection otherwise you need to use @Autowired*/

//    public Alien(Computer computer) {
//        this.computer = computer;
//    }

    Computer computer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void coding(){
        computer.compile();
    }

}
