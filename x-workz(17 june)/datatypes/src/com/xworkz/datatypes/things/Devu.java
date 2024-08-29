package com.xworkz.datatypes.things;

public class Devu {
	public WaterBottle waterBottle;
	
	public void fold()
	{
		System.out.println("Running fold in devu");
		if(waterBottle!=null)
		{
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println(waterBottle.quantity);
			System.out.println(waterBottle.color);
		}
		else {
			System.out.println("water bottle is null");
		}
	}
	

}
