package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Devu;
import com.xworkz.datatypes.things.Gunashree;
import com.xworkz.datatypes.things.Shwetha;
import com.xworkz.datatypes.things.WaterBottle;

public class WaterRunner {
	public static void main(String[] args) {
		Gunashree gunashree = new Gunashree();
		gunashree.drink();

		Shwetha shwetha = new Shwetha();
		WaterBottle waterBottle = new WaterBottle();
		shwetha.drop(waterBottle);

		Devu devu = new Devu();
		WaterBottle waterBottle1 = new WaterBottle();
		devu.waterBottle = waterBottle1;
		devu.fold();
	}
}
