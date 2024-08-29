package com.xworkz.datatypes.things;

public class WaterBottle {
	public double quantity;
	public String color;
	
	public WaterBottle()
	{
		System.out.println("Create waterBollte using no-arg constructore");
	}
	 
	public void fill()
	{
		System.out.println("Running fill in water Bottle");
	}
	
	public void empty()
	{
		System.out.println("Running empty in water bottle");
	}
	
	public void crush()
	{
		System.out.println("Running crush in water bottle");
	}

}
