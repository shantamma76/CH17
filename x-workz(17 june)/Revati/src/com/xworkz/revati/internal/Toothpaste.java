package com.xworkz.revati.internal;

public class Toothpaste {
	private String company;
	private boolean salt;

	public Toothpaste(String company) {
		this.company = company;
		System.out.println("Running string const in toothpaste");
	}

	public Toothpaste(String company, boolean salt) {
		this.company = company;
		this.salt = salt;
		System.out.println("Running string,boolean const in toothpaste");
	}

	public void display() {
		System.out.println("display from toothpaste");
		System.out.println("Company:" + company);
		System.out.println("salt:" + salt);
	}

}
