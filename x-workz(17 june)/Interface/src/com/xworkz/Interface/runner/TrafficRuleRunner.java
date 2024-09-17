package com.xworkz.Interface.runner;

import com.xworkz.Interface.Vehicles;

public class TrafficRuleRunner {
	
	public static void main(String[] args)
	{
		Vehicles signal=new Vehicles();
		signal.obeyTrafficSigns();	
		signal.useHelmet();
		signal.speedLimit();
		signal.useIndicators();
		signal.maintainSafeDistance();
		signal.donotUseMobile();
		signal.wearSeatBelt();
		signal.insurance();
		signal.licence();
		signal.noDrunkDriving();
		signal.noHonking();
		signal.obeyStopSigns();
		signal.managingTrafficFlow();
		
	}

}
