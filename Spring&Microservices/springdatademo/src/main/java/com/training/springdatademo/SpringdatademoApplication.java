package com.training.springdatademo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdatademoApplication {

	
	
	
	public static void main(String[] args) {
		ApplicationContext ioc =  SpringApplication.run(SpringdatademoApplication.class, args);
	
		 ProductRepository prd = ioc.getBean(ProductRepository.class);
		
		 product p = new product();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Product Name:: ");
		 String pname =  sc.next();
		 p.setPname(pname);
		 
		 System.out.println("Enter Product price:: ");
		 Integer price =  sc.nextInt();
		 p.setPrice(price);
		 
		 prd.save(p);
		 
	}
	
	
	

}
