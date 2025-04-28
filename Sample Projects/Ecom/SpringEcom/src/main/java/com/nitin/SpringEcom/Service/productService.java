package com.nitin.SpringEcom.Service;

import com.nitin.SpringEcom.Model.Product;
import com.nitin.SpringEcom.Repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class productService {

    @Autowired
    private productRepo repo;

    public List<Product> getAllProducts() {
        List<Product> list = repo.findAll();
        System.out.println(Arrays.toString(list.toArray()));
        return repo.findAll();
    }
}
