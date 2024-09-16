package com.xworkz.provider.internal;

public class DellProvider extends Provider {
	
	public DellProvider(String name,String ceoName)
	{
		super(name,ceoName);
		System.out.println("Create const in DellProvider using two string");
	}

	@Override
	public void service()
	{
		System.out.println("Running service in BookingProvider");
	}
}

