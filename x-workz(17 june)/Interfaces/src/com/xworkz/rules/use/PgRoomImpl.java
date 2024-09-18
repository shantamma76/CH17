package com.xworkz.rules.use;

import com.xworkz.rules.media.PGRule;

public class PgRoomImpl implements PGRule {

	@Override
	public double costPerMonth() {
		System.out.println("Running costPerMonth in PgRoomImpl");
		return 0;
	}

	@Override
	public boolean wifi() {
		System.out.println("Running wifi in PgRoomImpl");
		return false;
	}

}
