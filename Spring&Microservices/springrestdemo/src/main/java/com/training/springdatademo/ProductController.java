package com.training.springdatademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository repo;

	
	@GetMapping("/products")
	public List<product> getAll(){
		return (List<product>) repo.findAll();
	}
	
	@PostMapping("/save")
	public product saveProduct(@RequestBody product p) {
		return repo.save(p);
	}
	
	@GetMapping("/product/{pid}")
	public product findProduct(@PathVariable int pid) {
		return repo.findById(pid).orElseThrow(()->new RuntimeException("Product Not Found"));
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String delet(@PathVariable int id) {
		repo.deleteById(id);
		return "product deleted";
		
	}
	
	
	
}
