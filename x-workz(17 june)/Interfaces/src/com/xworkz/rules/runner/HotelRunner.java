package com.xworkz.rules.runner;

import com.xworkz.rules.media.FoodSafetyDepartment;
import com.xworkz.rules.media.HotelRule;
import com.xworkz.rules.use.CanaraHotelRuleImpl;

public class HotelRunner {

	public static void main(String[] args) {
		HotelRule hotelRule = new CanaraHotelRuleImpl();

		FoodSafetyDepartment department = new FoodSafetyDepartment();
		department.setHotelRule(hotelRule);
		department.inspection();

	}

}



