package com.nitin.SpringEcom.Repo;

import com.nitin.SpringEcom.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<Product,Integer> {
}
