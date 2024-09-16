package com.xworkz.provider.internal;

public class InternetProvider extends Provider {

	public InternetProvider(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("Running string,string of InternetProvider const ");
	}

	@Override
	public void service() {
		System.out.println("Running service in InternetProvider");
	}
	

}




