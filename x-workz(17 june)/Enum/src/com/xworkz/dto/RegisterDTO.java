package com.xworkz.dto;

import com.xworkz.constants.Country;
import com.xworkz.constants.Qualification;

public class RegisterDTO {

	private String name;
	private String collegeName;
	private Qualification qualification;
	private Country country;

	public RegisterDTO() {
		System.out.println("Running no-arg constructor");
	}

	public RegisterDTO(String name, String collegeName, Qualification qualification,Country country) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.qualification = qualification;
		this.country=country;
	}

	public String getName() {
		return name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public Country getCountry() {
		return country;
	}

}
