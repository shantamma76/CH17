package com.xworkz.Market;

public class Market {
	
	private String name;
	private String location;
	
	public Market(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Location:"+location);
	}

}
