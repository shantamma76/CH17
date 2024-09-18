package com.xworkz.rules.runner;

import com.xworkz.rules.media.PGRule;
import com.xworkz.rules.media.PgFood;
import com.xworkz.rules.use.PgRoomImpl;

public class PGRuleRunner {

	public static void main(String[] args) {

		PGRule pgRule = new PgRoomImpl();

		PgFood pgFood = new PgFood();
		pgFood.setPGRule(pgRule);
		pgFood.verify();

	}

}
