package com.zjs.web;

import java.util.Random;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjs.domain.Customer;

@SpringBootApplication
@RestController  
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/{id}")    
	public Customer view(@PathVariable("id") Long id){
		Customer ct = new Customer();
		ct.setId(id);
		ct.setName("wang");
		return ct;
	}
}
