package com.xworkz.engineering;

public class PlantRunner {

	public static void main(String[] args) {
		Plant plant1 = new Plant("Jasmine", "creepers", 50, 30, true, "oval", "fast", "white", "jasminum", 100);
		Plant plant2 = new Plant("rose", "creepers", 20, 30, true, "oval", "fast", "red", "rubiginosa", 150);
		Plant plant3 = new Plant("mango", "tree", 80, 300, true, "oval", "fast", "white", "mangifera indica", 200);
		Plant plant4 = new Plant("graps", "creepers", 15, 30, true, "circular", "fast", "green", "vitis vinifera", 300);
		Plant plant5 = new Plant("apple", "tree", 30, 500, true, "roughly oval", "fast", "red", "malus domestica", 250);

		Plant[] element = new Plant[5];
		element[0] = plant1;
		element[1] = plant2;
		element[2] = plant3;
		element[3] = plant4;
		element[4] = plant5;

		for (Plant verity : element) {
			System.out.println(verity);
			verity.display();
		}
	}

}
