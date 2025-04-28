package com.nitin.SpringEcom.Controller;

import com.nitin.SpringEcom.Model.Product;
import com.nitin.SpringEcom.Service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class productController {

    @Autowired
    private productService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getAllProducts();
    }

}
