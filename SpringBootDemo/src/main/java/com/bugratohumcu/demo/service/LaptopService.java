package com.bugratohumcu.demo.service;

import com.bugratohumcu.demo.model.Laptop;
import com.bugratohumcu.demo.repository.LaptopRepository;
import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {



    private LaptopRepository repo;

    public void addLaptop(Laptop laptop) {
       repo.save(laptop);
    }


    public LaptopRepository getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(LaptopRepository repo) {
        this.repo = repo;
    }
}
