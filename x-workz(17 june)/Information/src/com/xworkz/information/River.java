package com.xworkz.information;

public class River {
	
	private String[] riverNames=new String[7];
	private int index=0;
	
	public void water(String name)
	{
		System.out.println("Running water in river");
		this.riverNames[this.index]=name;
		this.index++;
	}
	
	public void display()
	{
		System.out.println("Running display in river");
		for(String ref:this.riverNames)
		{
			System.out.println("River names:"+ref);
			
			
		}
	}

}
