package com.xworkz.revati.internal;

public class Market {
	private String name;
	private String location;
	private int shops;
	private String type;

	public Market(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public Market(String name, String location,int shops, String type) {
		this.name = name;
		this.location = location;
		this.shops = shops;
		this.type = type;
	}

	public void display() {
		System.out.println("Display from market");
		System.out.println("Name:" + name);
		System.out.println("Location:" + location);
		System.out.println("shops:" + shops);
		System.out.println("type:" + type);
	}

}
