package com.xworkz.gun.things;

public class Freezer {

	private String brand;
	private String color;
	private int price;

	public Freezer() {
		System.out.println("Create Freezer using no-arg const..");
	}

	public Freezer(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public void cool() {
		System.out.println("Running cool in Freezer");
	}

	public void show() {
		System.out.println("Freezer Brand:" + brand);
		System.out.println("Freezer color:" + color);
		System.out.println("Freezer price:" + price);

	}

}
