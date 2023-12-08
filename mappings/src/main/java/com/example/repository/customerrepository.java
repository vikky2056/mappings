package com.example.repository;

import com.example.model.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerrepository extends JpaRepository<customer,Integer> {
}
