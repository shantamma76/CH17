package com.xworkz.internal;

//100% 

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Running start in Bike");

	}

	@Override
	public void stop() {
		System.out.println("Running stop in Bike");

	}

	@Override
	public void honk() {
		System.out.println("Running honk in Bike");

	}

}
