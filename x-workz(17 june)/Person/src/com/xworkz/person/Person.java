package com.xworkz.person;

public class Person {
	private String name;
	private String email;
	private int age;
	private String mobileNo;

	// Constructor
	public Person(String name, String email, int age, String mobileNo) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	// Override toString method for easy printing
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
}
