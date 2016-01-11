package com.zjs.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration    
@ComponentScan    
@EnableAutoConfiguration 
public class CustomerService {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CustomerService.class);  
        app.setWebEnvironment(true);  
        app.setShowBanner(false);  
          
        Set<Object> set = new HashSet<Object>();  
        //set.add("classpath:applicationContext.xml");  
        app.setSources(set);  
        app.run(args);  
	}
}
