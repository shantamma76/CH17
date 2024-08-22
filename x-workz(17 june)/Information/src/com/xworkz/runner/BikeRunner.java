package com.xworkz.runner;

import com.xworkz.information.Bike;

public class BikeRunner {
	
	public static void main(String[] args)
	{
		Bike bike = new Bike();
		bike.showNames();
		
		bike.same("Royal Enfield");
		bike.same("Activa");
		bike.same("KTM");
		bike.same("Pulsar");
		bike.same("tvs");
		bike.same("Jupitar");
		bike.same("Bajaj Pulsar");
		
		bike.showNames();


	}

}
