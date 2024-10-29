package com.xworkz.revati.internal;

public class Park {
	
	private String name;
	private int ticketPrice;
	
	public Park(String name,int ticketPrice)
	{
		super();
		this.name=name;
		this.ticketPrice=ticketPrice;
		System.out.println("Running string ,int in park");
	}
	
	public void check()
	{
		System.out.println("Running check in park");
	}
	
	public void display() {
		System.out.println("Running display in park");
		System.out.println("Name:"+name);
		System.out.println("TicketPrice:"+ticketPrice);
	}
}
