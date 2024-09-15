package com.xworkz.jeans;

public class Kettle {
	
	private String brand;
	private String material;
	private int capacity;
	private int size;
	private double price;
	private String color;
	
	public Kettle(String brand,String material,int capacity,int size,double price,String color)
	{
		super();
		this.brand = brand;
		this.material = material;
		this.capacity = capacity;
		this.size = size;
		this.price = price;
		this.color = color;
	}

	public Kettle(String brand,int capacity,double price) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Kettle [brand="+brand+",capacity="+capacity+ ", price="+price+"]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
	System.out.println("running equals in Kettle");
	if (obj!= null) {
		
	   if(obj  instanceof Kettle) {
				Kettle casted=(Kettle)obj;
				
		if(this.brand.equals(casted.brand)&&this.capacity==casted.capacity &&this.price==casted.price)
		{
		  System.out.println("left side is equal to right");
		  return true;
		}
		}
		else {
			System.out.println("obj is not Kettle");
			}
	}
	          return false;
	}
	
	public void setBrand(String brand) 
	{
	this.brand = brand;
    }

   public void setCapacity(int capacity) 
   {
	this.capacity = capacity;
   }
   
   public void setPrice(double price)
    {
	this.price = price;
    }
}
	


