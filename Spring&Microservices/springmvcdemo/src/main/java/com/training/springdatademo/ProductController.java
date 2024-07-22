package com.training.springdatademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository repo;

	@GetMapping("/save")
	public String saveProduct(product p) {
		
		repo.save(p);
		return "succes";
	}
	
	@GetMapping("/product")
	public String prodcutDetais() {
		return "product";
	}
	
	
}
