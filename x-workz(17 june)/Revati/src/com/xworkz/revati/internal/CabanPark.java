package com.xworkz.revati.internal;

public class CabanPark extends Park {
	
	public CabanPark(String name,int ticketPrice)
	{
		super(name,ticketPrice); //chaining
		System.out.println("Running string ,int in park");
	}
	
    @Override
	public void check()
	{
		System.out.println("Running check in caban Park");
	}
	

}
