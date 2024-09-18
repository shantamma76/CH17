package com.xworkz.rules.use;

import com.xworkz.rules.media.HotelRule;

public class CanaraHotelRuleImpl implements HotelRule {

	@Override
	public boolean cleanPremises() {
		System.out.println("Running cleanPremises in CanaraHotelRuleImpl");
		return false;
	}

}
