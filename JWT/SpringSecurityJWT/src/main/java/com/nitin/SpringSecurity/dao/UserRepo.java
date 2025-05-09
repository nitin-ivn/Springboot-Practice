package com.nitin.SpringSecurity.dao;

import com.nitin.SpringSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
