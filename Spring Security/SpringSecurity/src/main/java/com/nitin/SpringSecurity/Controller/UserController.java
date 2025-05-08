package com.nitin.SpringSecurity.Controller;

import com.nitin.SpringSecurity.model.User;
import com.nitin.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        System.out.println(user);
        return service.saveUser(user);
    }

}
