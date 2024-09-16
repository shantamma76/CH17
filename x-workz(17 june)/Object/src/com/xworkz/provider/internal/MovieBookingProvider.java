package com.xworkz.provider.internal;

public class MovieBookingProvider extends BookingProvider   {
	

	public MovieBookingProvider(String name,String ceoName)
	{
		super(name,ceoName);
		System.out.println("Running string,string of MovieBookingProvider const ");
	}
	
	public void book()
	{
		System.out.println("Running book in MovieBookingProvider");
	}
	
	public void cancle()
	{
		System.out.println("Running cancle in MovieBookingProvider");
	}
	
	@Override
	public void service()
	{
		System.out.println("Running service in BookingProvider");
	}

}
