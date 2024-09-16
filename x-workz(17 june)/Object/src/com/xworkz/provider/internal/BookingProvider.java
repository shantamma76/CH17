package com.xworkz.provider.internal;

public class BookingProvider extends Provider  {
	
	public BookingProvider(String name,String ceoName)
	{
		super(name,ceoName);
		System.out.println("create const in BookingProvider using two strings");
	}
	
	@Override
	public void service()
	{
		System.out.println("Running service in BookingProvider");
	}
	

}
