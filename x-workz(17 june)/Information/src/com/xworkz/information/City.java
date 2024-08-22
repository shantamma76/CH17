package com.xworkz.information;

public class City {
	
	private String[] cityNames=new String[7];
	private int index=0;
	
	public void traffic(String name)
	{
		System.out.println("Running traffic in city");
		this.cityNames[this.index]=name;
		this.index++;
	}
	
	public void display()
	{
		System.out.println("Running display in cist");
		for(String cities:this.cityNames)
		{
			System.out.println("city name:"+cities);
		}
	}

}
