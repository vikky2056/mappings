package com.example.repository;

import com.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productrepository extends JpaRepository<Product,Integer> {
}
