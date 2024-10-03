package com.xworkz.dto;

import com.xworkz.constants.ProductType;

public class CustomerDTO {

	private String name;
	private String email;
	private ProductType productType;

	public CustomerDTO() {
		System.out.println("no-arg const in CustomerDTO");
	}

	public CustomerDTO(String name, String email, ProductType productType) {
		super();
		this.name = name;
		this.email = email;
		this.productType = productType;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public ProductType getProductType() {
		return productType;
	}

}
