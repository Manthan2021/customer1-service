package com.coforge.Assignment.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {

	@Id
	private Long custId;
	private String name;
	
	
	public Customer(Long custId, String name) {
		super();
		this.custId = custId;
		this.name = name;
	}
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
