package com.xworkz.provider.internal;

public class Fast5gExtreme extends ExtremeAirtelInternetProvider {
	
	public Fast5gExtreme(String name,String ceoName)
	{
		super(name,ceoName);
		System.out.println("create const in Fast5gExtreme using two strings");
	}
	
	@Override
	public void service()
	{
		System.out.println("Running service in Fast5gExtreme");
	}

}
