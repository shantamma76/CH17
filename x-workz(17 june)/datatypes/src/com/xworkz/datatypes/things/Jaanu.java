package com.xworkz.datatypes.things;

public class Jaanu {

	public void jio(Chocolate chocolate) {
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
