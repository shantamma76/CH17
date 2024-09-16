package com.xworkz.provider.internal;

public class LenovaProvider extends Provider {
	private double profit;
	 
	public LenovaProvider(String name, String ceoName, double profit)
	{
		super(name,ceoName);
		this.profit=profit;
		System.out.println("Create constructor in LenovaProvider using two strings");
	}

	@Override
	public void service()
	{
		System.out.println("Running service in BookingProvider");
	}
	
	public void show()
	{
		System.out.println("profite is:"+profit);
	}
	
}

