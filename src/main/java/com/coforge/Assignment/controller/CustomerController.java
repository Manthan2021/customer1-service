package com.coforge.Assignment.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.coforge.Assignment.model.Customer;
import com.coforge.Assignment.model.Product;
import com.coforge.Assignment.service.CustomerService;

@RestController
@RequestMapping("/customer")

public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{custId}")
	public Customer getCustomer(@PathVariable("custId") Long custId) {
		
		//http://localhost:7764/product/customer/102
		Customer customer=customerservice.getCustomer(custId);
	List<Product> products=this.restTemplate.getForObject("http://localhost:7764/product/customer/"+custId,List.class);
	
	customer.setProducts(products);
	return customer;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
