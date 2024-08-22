package com.xworkz.engineering;

public class Ball {

	    private int size;
	    private int weight;
	    private int bounceCount;
	    private int rollDistance;
	    private String color;
	    private String materials;
	    private boolean isInflated;
	    private String brand;
	    private double diameter;
	    private String pattern;
	    private int age;
	    private int pressure;
	    private String owner;
	    private boolean isActive;
	    private int temperature;
	    private int gripLevel;
	    private boolean isRepaired;
	    private String type;
	    private double circumference;
	    private int spinRate;
	    private boolean isUsed;
	    private int quality;
	    private int durability;
	    private boolean isOnField;
	    private String countryOfOrigin;
	    private String shape;

	    // Constructor
	    public Ball(int size, int weight,int bounceCount,int rollDistance,String color,String materials,boolean isInflated,String brand,
	    		double diameter,String pattern,int age,int pressure,String owner,boolean isActive,int temperature,int gripLevel,
	    		boolean isRepaired,String type,double circumference,int spinRate,boolean isUsed,int quality,int durability,boolean isOnField,
	    		String countryOfOrigin,String shape)
	    {
	        this.size = size;
	        this.weight = weight;
	        this.bounceCount = bounceCount;
	        this.rollDistance = rollDistance;
	        this.color = color;
	        this.materials = materials;
	        this.isInflated = isInflated;
	        this.brand = brand;
	        this.diameter = diameter;
	        this.pattern = pattern;
	        this.age = age;
	        this.pressure = pressure;
	        this.owner = owner;
	        this.isActive = isActive;
	        this.temperature = temperature;
	        this.gripLevel = gripLevel;
	        this.isRepaired = isRepaired;
	        this.type = type;
	        this.circumference = circumference;
	        this.spinRate = spinRate;
	        this.isUsed = isUsed;
	        this.quality = quality;
	        this.durability = durability;
	        this.isOnField = isOnField;
	        this.countryOfOrigin = countryOfOrigin;
	        this.shape = shape;
	    }

	    public void display() {
	    	System.out.println("size:"+this.size);
	    	System.out.println("weight:"+this.weight);
	    	System.out.println("bounceCount:"+this.bounceCount);
	    	System.out.println("rollDistance:"+this.rollDistance);
	    	System.out.println("color:"+this.color);
	    	System.out.println("materials:"+this.materials);
	    	System.out.println("brand:"+this.brand);
	    	System.out.println("diameter:"+this.diameter);
	    	System.out.println("isInflated:"+this.isInflated);
	    	System.out.println("pattern:"+this.pattern);
	    	System.out.println("age:"+this.age);
	    	System.out.println("pressure:"+this.pressure);
	    	System.out.println("owner:"+this.owner);
	    	System.out.println("isActive:"+this.isActive);
	    	System.out.println("temperature:"+this.temperature);
	    	System.out.println("gripLevel:"+this.gripLevel);
	    	System.out.println("isRepaired:"+this.isRepaired);
	    	System.out.println("type:"+this.type);
	    	System.out.println("circumference:"+this.circumference);
	    	System.out.println("spinRate:"+this.spinRate);
	    	System.out.println("isUsed:"+this.isUsed);
	    	System.out.println("quality:"+this.quality);
	    	System.out.println("durability:"+this.durability);
	    	System.out.println("isOnField:"+this.isOnField);
	    	System.out.println("countryOfOrigin:"+this.countryOfOrigin);
	    	System.out.println("shape:"+this.shape);
	    	
	}
}
	

