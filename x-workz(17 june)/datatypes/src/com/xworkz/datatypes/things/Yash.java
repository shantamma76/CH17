package com.xworkz.datatypes.things;

public class Yash {

	public void tear(Hat hat) //parameter
	{

		if (hat != null) {
			hat.shade();
			System.out.println(hat.color);
		} else {
			System.out.println("Hat is Null");
		}

	}
}
