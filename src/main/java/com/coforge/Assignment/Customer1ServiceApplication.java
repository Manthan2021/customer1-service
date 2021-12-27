package com.coforge.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Customer1ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Customer1ServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
	//http://localhost:7763/customer/101
   //http://localhost:7764/product/customer/102	
	
	

}
