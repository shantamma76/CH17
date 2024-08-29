package com.xworkz.datatypes.things;

public class Shoe {
	
	public String brand;
	public double cost;
	
	public Shoe()
	{
		System.out.println("Create shoe using no-arg const..");
	}
	
	public void safeGuard()
	{
		System.out.println("Running safe Guard in shoe");
	}
	
	public void enhanceWalk()
	{
		System.out.println("Running enhanceWalk in shoe");
	}

}
