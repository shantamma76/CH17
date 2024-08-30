package com.xworkz.gun.things;

public class WashingMachine {
	
	private String brand;
	private String type;
	private int capacity;
	
	public WashingMachine()
	{
		System.out.println("Create washingmachine using no-arg const..");
	}

	public WashingMachine(String brand, String type, int capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}
	
	public void rinse()
	{
		System.out.println("Running rinse in WashingMachine ");
	}
	
	public void show()
	{
		System.out.println("brand:" + brand);
		System.out.println("type:" + type);
		System.out.println("capacity:" + capacity);
	}

}
