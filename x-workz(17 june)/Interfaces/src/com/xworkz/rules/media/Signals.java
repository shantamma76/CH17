package com.xworkz.rules.media;

public class Signals {

	private TrafficRule trafficRule;
	
	public void setTrafficRule(TrafficRule trafficRule)
	{
		this.trafficRule=trafficRule;
	}
	
	public void check()
	{
		System.out.println("Runnin check in signals");
		
		if(trafficRule!=null)
		{
			
			trafficRule.licenceNo();
			System.out.println("TrafficRule is not null");
		} else {
			System.out.println("TrafficRule is null");
		}
	}
	
	
}
