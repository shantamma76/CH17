package com.xworkz.engineering;

public class SnakeRunner {

	public static void main(String[] args) {
		//TODO Auto generation method stub
		Snake snake1 = new Snake("cobra", 15, "poisonous");
		Snake snake2 = new Snake("anaconda", 30, "Dangerouse");
		Snake snake3 = new Snake("python", 10, "poisonous");

		Snake[] ref = new Snake[3];
		ref[0] = snake1;
		ref[1] = snake2;
		ref[2] = snake3;

		for (Snake snakeNames : ref) {
			System.out.println(snakeNames);
			snakeNames.print();
		}
	}
}
