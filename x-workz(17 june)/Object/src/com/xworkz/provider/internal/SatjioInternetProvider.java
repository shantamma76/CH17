package com.xworkz.provider.internal;

public class SatjioInternetProvider extends JioInternetProvider {
	private double cost;
	private String launchDate;
	
	
	public SatjioInternetProvider(String name,String ceoName,double cost,String launchDate)
	{
		super(name,ceoName);
		this.cost=cost;
		this.launchDate=launchDate;
		System.out.println("create const in SatjioInternetProvider using three strings");
	}
	
	@Override
	public void service()
	{
		System.out.println("Running service in BookingProvider");
	}

	public void display()
	{
		System.out.println("Cost:"+cost);
		System.out.println("LanchDate:"+launchDate);
	}
}



