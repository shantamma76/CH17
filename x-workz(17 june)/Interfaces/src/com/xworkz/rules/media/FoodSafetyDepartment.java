package com.xworkz.rules.media;

public class FoodSafetyDepartment {
	private HotelRule hotelRule;
	
	public void setHotelRule(HotelRule hotelRule)
	{
		this.hotelRule=hotelRule;
	}
	
	
	public void inspection() {
		System.out.println("Running inspection in FoodSafetyDepartment");
		if(hotelRule!=null)
		{
			System.out.println("hotelRule is not null");
			hotelRule.cleanPremises();
		} else {
			System.out.println("HotelRule is null");
		}
	}

}
