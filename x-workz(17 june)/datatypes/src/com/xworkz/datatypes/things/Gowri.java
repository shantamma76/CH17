package com.xworkz.datatypes.things;

public class Gowri {
	
	public Chocolate chocolate; //instance
	
	public void silent()
	{
		if (chocolate != null) {
			chocolate.baking();
			chocolate.cream();
			chocolate.butter();
			System.out.println(chocolate.name);
			System.out.println(chocolate.price);
		} else {
			System.out.println("Jaanu chocolate is null");

		}
	}

}
