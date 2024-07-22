package com.training.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
	ApplicationContext ioc = 	SpringApplication.run(SpringcoredemoApplication.class, args);
		
	User u = ioc.getBean(User.class);
	u.setUserid(1);
	u.setUsername("vivek");
	
	Product p = ioc.getBean(Product.class);
	p.setPid(1);
	p.setName("Mobile");
	p.setPrice(50);
	
	
	
	System.out.println(p);
	
	
		
	}

}
