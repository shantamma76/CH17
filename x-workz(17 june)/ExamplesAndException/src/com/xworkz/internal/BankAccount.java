package com.xworkz.internal;

//encapsulation

public class BankAccount {

	private double balence;
	private String bankName;
	
	public void getBalence()
	{
		System.out.println("Running getBalence in BankAccount");
	}
	
	public void setBalence(String bankName) 
	{
		this.bankName=bankName;
		System.out.println("Running setBalence in BankAccount");
	}
	
	public void getBankName() 
	{
		System.out.println("Running getBankName in BankAccount");
	}
	
	public void setBankName(String bankName)
	{
		this.bankName=bankName;
		System.out.println("Running setBank in BankAccount");
	}
	
}




