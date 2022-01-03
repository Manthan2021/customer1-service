package com.coforge.Assignment.model;

import java.util.ArrayList;
import java.util.List;

public class CustProd {

	private Long custId;
	private String name;
	
	List<Product> products=new ArrayList<>();

	public CustProd(Long custId, String name, List<Product> products) {
		super();
		this.custId = custId;
		this.name = name;
		this.products = products;
	}

	public CustProd() {
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
