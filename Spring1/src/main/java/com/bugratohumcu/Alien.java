package com.bugratohumcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Alien {

    @Value("20")
    private int num;
    private Computer computer;
   // private Laptop laptop;

    public Alien(){
        System.out.println("Object created");
    }

    public Alien(int num) {
        this.num = num;
        System.out.println("Number : " + num);
    }

    public Alien(int num, Computer computer) {
        this.num = num;
        this.computer = computer;

        System.out.println("Laptop and Number has been created");
    }

    public Computer getComputer() {
        return computer;
    }

    //@Qualifier("laptop")
    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


//        public Laptop getLaptop() {
//        return laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }



    public void coding(){
        System.out.println("Coding");
        computer.compile();
    }
}
