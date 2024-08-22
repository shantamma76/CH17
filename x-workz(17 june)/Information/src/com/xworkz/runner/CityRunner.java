package com.xworkz.runner;

import com.xworkz.information.City;

public class CityRunner {
	
	public static void main(String[] args) {
		City city = new City();
		city.display();

		city.traffic("Bangalore");
		city.traffic("kalaburgi");
		city.traffic("Mysore");
		city.traffic("Mangalore");
		city.traffic("Bijapur");
        city.traffic("Gadag");
        city.traffic("Kopal");
        
        city.display();
        

	}

}
