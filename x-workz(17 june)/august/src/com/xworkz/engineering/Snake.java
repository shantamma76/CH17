package com.xworkz.engineering;

public class Snake {
	
	private String name;
	private int length;
	private String type;

	public Snake(String name,int length,String type)
	{
	this.name=name;
	this.length=length;
	this.type=type;
	System.out.println("Creating snakes");
	}

	public void print() {
		// TODO Auto-generated method stub
	System.out.println("Name:"+this.name);
	System.out.println("Length:"+this.length);
	System.out.println("type:"+this.type);
	}


}
