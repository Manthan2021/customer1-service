package com.coforge.Assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coforge.Assignment.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	List<Customer> list=List.of(
			new Customer(101L,"Manthan"),
			new Customer(102L,"Sagar"),
			new Customer(103L,"Prateek"),
			new Customer(104L,"Aman")
			);
	
	
	@Override
	public Customer getCustomer(Long id) {
		
		return this.list.stream().filter(customer -> customer.getCustId().equals(id)).findAny().orElse(null);
	}

}
