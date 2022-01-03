package com.coforge.Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.Assignment.model.Customer;



public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
