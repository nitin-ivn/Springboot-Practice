package com.nitin.demo.repo;

import com.nitin.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("in repo");
    }
}
