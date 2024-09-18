package com.xworkz.rules.use;

import com.xworkz.rules.media.TrafficRule;

public class TrafficPoliceImpl implements TrafficRule {

	@Override
	public String licenceNo() {
		System.out.println("Running licenceNo in TrafficPoliceimpl");
		return null;
	}

}
