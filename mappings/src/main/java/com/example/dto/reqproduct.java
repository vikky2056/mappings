package com.example.dto;

import com.example.model.Product;
import com.example.model.customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public
class reqproduct {
   @Autowired
   private customer Customer;


}
