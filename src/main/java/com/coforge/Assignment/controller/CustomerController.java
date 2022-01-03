package com.coforge.Assignment.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.coforge.Assignment.model.CustProd;
import com.coforge.Assignment.model.Customer;
import com.coforge.Assignment.model.Product;
import com.coforge.Assignment.service.CustomerService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/customer")

public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Customer> > getAllCustomer(Customer customer) {

		return new ResponseEntity<>(customerservice.getCustomer(),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Customer> getAllCustomerById(@PathVariable Long id) {
		
		return new ResponseEntity<>(customerservice.getCustomer2(id),HttpStatus.OK);
	}
	
	@PostMapping("/addAll")
	public ResponseEntity<Customer> AddProduct(@RequestBody Customer customer) {
		return new ResponseEntity<>(customerservice.saveCustomer(customer),HttpStatus.OK);
	}
	 
	@PutMapping("/updateAll")
	public ResponseEntity<Customer>  editCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<>(customerservice.updateCustomer(customer),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteAll/{id}")
	public String deleteProduct(@PathVariable Long id) {
		return "Customer "+customerservice.deleteCustomer(id);
	}
		
	@GetMapping("/{custId}")
	public CustProd getCustomer(@PathVariable("custId") Long custId) {
		
		//http://localhost:7764/product/customer/102
		Customer customer=customerservice.getCustomer(custId);
	List<Product> products=this.restTemplate.getForObject("http://localhost:7764/product/customer/"+custId,List.class);
	CustProd custprod=new CustProd(customer.getCustId(),customer.getName(),products);
	return custprod;
	
		
	}
			
	}
	
	

	

