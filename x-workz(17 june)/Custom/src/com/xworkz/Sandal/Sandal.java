package com.xworkz.Sandal;

public class Sandal {
	
	private String brand;
	private char size;
	private double cost;
	private String color;
	
	public Sandal(String brand,char size,double cost,String color)
	{
		this.brand=brand;
		this.size=size;
		this.cost=cost;
		this.color=color;
		
		
		
	}
	public void display()
	{
		System.out.println("brand:"+brand);
		System.out.println("size:"+size);
		System.out.println("cost:"+cost);
		System.out.println("color:"+color);
	}
	
}
