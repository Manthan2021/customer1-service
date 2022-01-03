package com.coforge.Assignment.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.Assignment.Repository.CustomerRepo;
import com.coforge.Assignment.model.Customer;




@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo cRepo;
	
	
	@Override
	public Customer getCustomer2(Long id) {
		// TODO Auto-generated method stub
		
		return cRepo.findById(id).get();
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return cRepo.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cRepo.save(customer);
	}

	@Override
	public String deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		 cRepo.deleteById(id);
         return "deleted";
	}

	@Override
	public Customer getCustomer(Long id) {
		List<Customer> list1 = cRepo.findAll().stream().collect(Collectors.toList());
		Customer list2 = list1.stream().filter(customer -> customer.getCustId().equals(id)).findAny().orElse(null);
	    return(list2);
	}

	
}