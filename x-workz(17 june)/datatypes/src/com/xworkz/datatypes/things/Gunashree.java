package com.xworkz.datatypes.things;

public class Gunashree {

	public void drink() {
		WaterBottle waterBottle = new WaterBottle();  //local

		waterBottle.fill();
		waterBottle.empty();
		waterBottle.crush();

		System.out.println(waterBottle.quantity);
		System.out.println(waterBottle.color);

	}

}
