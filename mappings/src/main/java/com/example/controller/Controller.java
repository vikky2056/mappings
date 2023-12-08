package com.example.controller;

import com.example.dto.reqproduct;
import com.example.model.customer;
import com.example.repository.customerrepository;
import com.example.repository.productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private customerrepository Customerrepo;
    @Autowired
    private productrepository Productrepo;

    @PostMapping("/customer") public customer place(@RequestBody reqproduct req){
        return Customerrepo.save(req.getCustomer());
    }

    @GetMapping("/customer") public List<customer> findAllOrders(){
        return Customerrepo.findAll();
    }

}
