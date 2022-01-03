package com.coforge.Assignment.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.coforge.Assignment.model.Customer;


public interface CustomerService {
	

	
	public Customer getCustomer(@PathVariable Long id);
	
	 public List<Customer> getCustomer();
	 
	 public Customer  getCustomer2(@PathVariable Long id);
		 
	public Customer saveCustomer(@RequestBody Customer customer);
	 
	public Customer updateCustomer(@RequestBody Customer customer);
	
	
	public String deleteCustomer(@PathVariable Long id);
	

}
