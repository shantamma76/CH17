package com.xworkz.inheritance.Runner;

import com.xworkz.inheritance.things.Bulb;
import com.xworkz.inheritance.things.Tubelight;

public class BulbRunner {
	public static void main(String[] args) {
		Tubelight tubelight1 = new Tubelight();
		tubelight1.volts = 20;
		System.out.println(tubelight1.volts);

		Bulb bulb = new Tubelight();
		bulb.volts = 33;
		System.out.println(bulb.volts);

		tubelight1.glow();

	}

}
