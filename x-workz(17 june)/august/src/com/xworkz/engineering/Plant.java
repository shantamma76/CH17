package com.xworkz.engineering;

public class Plant {
	private String name;
	private String type;
	private int length;
	private double weight;
	private boolean needWater; 
	private String shape;
	private String growth;
	private String flowerColor;
	private String scientificName;
	private int price;
	
public Plant(String name,String type,int length,double weight,boolean needWater,String shape,String growth,
		String flowerColor,String scientificName,int price)
{
	this.name=name;
	this.type=type;
	this.length=length;
	this.weight=weight;
	this.needWater=needWater;
	this.shape=shape;
	this.growth=growth;
	this.flowerColor=flowerColor;
	this.scientificName=scientificName;
	this.price=price;
	
}

public void display()
{
	System.out.println("Name:"+this.name);
	System.out.println("Type:"+this.type);
	System.out.println("Length:"+this.length);
	System.out.println("weight:"+this.weight);
	System.out.println("needWater:"+this.needWater);
	System.out.println("shape:"+this.shape);
	System.out.println("growth:"+this.growth);
	System.out.println("flowerColor:"+this.flowerColor);
	System.out.println("scientificName:"+this.scientificName);
	System.out.println("price:"+this.price);
	
}
	
}
