package com.xworkz.engineering;

public class BallRunner {

	public static void main(String[] args) {

		Ball ball1 = new Ball(10, 20, 20, 30, "red", "rubber", false, "ola", 24, "cricket", 20, 30, "kohli", true, 56,
				10, true, "football", 34, 12, false, 23, 45, true, "india", "round");
		Ball ball2 = new Ball(15, 25, 12, 13, "black", "plastic", true, "volvo", 23, "volleyball", 23, 45, "rohit",
				false, 34, 56, true, "basketball", 32, 13, true, 14, 34, true, "karnataka", "oval");
		Ball ball3 = new Ball(20, 30, 15, 45, "pink", "steel", false, "tcs", 34, "basketball", 24, 45, "dhoni", false,
				34, 13, true, "hockey", 23, 26, true, 15, 25, false, "andhra", "circle");
		Ball ball4 = new Ball(25, 35, 20, 50, "blue", "rubber", false, "tcs", 34, "basketball", 24, 45, "rohit", false,
				34, 13, true, "hockey", 23, 26, true, 15, 25, false, "tamilNadu", "circle");
		Ball ball5 = new Ball(30, 40, 25, 54, "orange", "Spange", false, "tcs", 34, "basketball", 24, 45, "rohit",
				false, 34, 13, true, "hockey", 23, 26, true, 15, 25, false, "India", "oval");
		Ball ball6 = new Ball(35, 45, 30, 56, "purple", "plastic", false, "tcs", 34, "basketball", 26, 55, "rahul",
				false, 34, 13, true, "hockey", 23, 26, true, 20, 22, false, "UK", "oval");

		Ball ball7 = new Ball(30, 40, 25, 54, "orange", "Spange", false, "tcs", 34, "basketball", 25, 48, "viraj",
				false, 34, 13, true, "hockey", 23, 26, true, 15, 25, false, "USA", "cicle");

		Ball ball8 = new Ball(30, 40, 25, 54, "orange", "Spange", false, "tcs", 34, "basketball", 30, 48, "Rocky",
				false, 30, 16, true, "hockey", 23, 29, true, 14, 16, false, "Astralia", "oval");

		Ball[] balls = new Ball[8];
		balls[0] = ball1;
		balls[1] = ball2;
		balls[2] = ball3;
		balls[3] = ball4;
		balls[4] = ball5;
		balls[5] = ball6;
		balls[6] = ball7;
		balls[7] = ball8;

		for (Ball varities : balls) {
			System.out.println(varities);
			varities.display();

		}
	}
}
