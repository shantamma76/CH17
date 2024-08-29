package com.xworkz.datatypes.things;

public class Shwetha {
	
	public void drop(WaterBottle waterBottle)
	{
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


