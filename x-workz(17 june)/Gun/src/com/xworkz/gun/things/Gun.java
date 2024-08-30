package com.xworkz.gun.things;

public class Gun {
	private String name;
	private String countryMade;
	private String type;
	
	public Gun() {
		super();
		System.out.println("Create gun using no-arg const..");
	}

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}
	
	public void fire()
	{
		System.out.println("running fir in gun");
	}

	public void display() {
		System.out.println("Name:" + name);
		System.out.println("countryMade:" + countryMade);
		System.out.println("type:" + type);
	}

}




