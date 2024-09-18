package com.xworkz.rules.runner;

import com.xworkz.rules.media.Signals;
import com.xworkz.rules.media.TrafficRule;
import com.xworkz.rules.use.TrafficPoliceImpl;

public class TrafficRuleRunner {

	public static void main(String[] args) {
		
		TrafficRule trafficRule=new TrafficPoliceImpl();
		
		Signals signals=new Signals();
		signals.setTrafficRule(trafficRule);
		signals.check();
		
	}
}
