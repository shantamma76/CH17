package com.xworkz.provider.internal;

public class ExtremeAirtelInternetProvider extends AirtelInternetProvider {
	
	public ExtremeAirtelInternetProvider(String name,String ceoName)
	{
		super(name,ceoName);
		System.out.println("create const in ExtremeAirtelInternetProvider using two strings");
	}
	
	@Override
	public void service()
	{
		System.out.println("Running service in ExtremeAirtelInternetProvider");
	}

}


