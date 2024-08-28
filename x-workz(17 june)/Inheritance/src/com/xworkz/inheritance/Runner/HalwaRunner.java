package com.xworkz.inheritance.Runner;

import com.xworkz.inheritance.things.Halwa;
import com.xworkz.inheritance.things.Sweet;

public class HalwaRunner {
	public static void main(String[] args) {
		Sweet sweet = new Sweet();
		sweet.name = "carrote";
		sweet.color = "orange";
		sweet.price = 50;
		System.out.println(sweet.name);
		System.out.println(sweet.color);
		System.out.println(sweet.price);

		Halwa halwa1 = new Sweet();
		halwa1.name = "Mango";
		halwa1.color = "Yellow";
		halwa1.price = 70;
		System.out.println(halwa1.name);
		System.out.println(halwa1.color);
		System.out.println(halwa1.price);

		sweet.sugar();
		sweet.recipe();

	}

}
