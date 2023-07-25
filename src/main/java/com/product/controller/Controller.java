package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.product.entity.Product;

import jakarta.websocket.server.PathParam;

import com.product.Service.ProductService;

@RestController
public class Controller {
	@Autowired
	ProductService service;
	
	@GetMapping("/getproducts")
	public List<Product> getproduct(){
		int n=10/0;
		return service.getallproducts();
	}
	
	
	@GetMapping("/getproducts/name/{name}")
	public List<Product> getproductname( @PathVariable String  name) {
		
		return service.getproductname(name.toLowerCase());
	}
	
	@GetMapping("/getproducts/type/{type}")
	public List<Product> getproducttype( @PathVariable String  type) {
		return service.getproducttype(type.toLowerCase());
	}
	
	@GetMapping("/getproducts/warranty")
	public List<Product> getproductwarranty( ) {
		return service.getproductwarranty();
	}
	
	@PostMapping("/addproducts")
	public void addproducts(@RequestBody Product p,Model model) {
		p.setName(p.getName().toLowerCase());
		p.setPlace(p.getPlace().toLowerCase());
		p.setType(p.getType().toLowerCase());
		service.addproduct(p);
	}
	
	@DeleteMapping("/getproducts/delete/{name}")
	public String deleteproduct(@PathVariable String name) {
		return service.deleteproductname(name.toLowerCase())+" record deleted successfully";
		
	}
}
