package com.bugratohumcu.demo.repository;

import com.bugratohumcu.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        lap.compile();
    }
}
