package com.xworkz.revati.runner;

import com.xworkz.revati.internal.CabanPark;

public class ParkRunner {
	
	public static void main(String[] args)
	{
		CabanPark cabanPark= new CabanPark("caban park",20);
		cabanPark.check();
	    cabanPark.display();
	}

}
