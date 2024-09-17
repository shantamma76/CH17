package com.xworkz.Interface;

public class Vehicles implements Signal {
	
	public Vehicles() {
		super();
		System.out.println("No arg-const in vehicles");
	}

	@Override
	public boolean obeyTrafficSigns() {
		System.out.println("Running obeyTrafficSigns");
		return true;
	}

	@Override
	public boolean useHelmet() {
		System.out.println("Running useHelmet");
		return false;
	}

	@Override
	public int speedLimit() {
		System.out.println("Running speedLimit");
		return 0;
	}

	@Override
	public boolean useIndicators() {
		System.out.println("Running UseIndicators");
		return false;
	}

	@Override
	public boolean maintainSafeDistance() {
		System.out.println("Running maintainSafeDistance");
		return false;
	}

	@Override
	public boolean donotUseMobile() {
		System.out.println("Running donotUseMobile");
		return false;
	}

	@Override
	public boolean wearSeatBelt() {
		System.out.println("Running wearSeatBelt");
		return false;
	}

	@Override
	public boolean insurance() {
		System.out.println("Running wearSeatBelt");
		return false;
	}

	@Override
	public boolean licence() {
		System.out.println("Running licence");
		return false;
	}

	@Override
	public boolean noDrunkDriving() {
		System.out.println("Running noDrunkDriving");
		return false;
	}

	@Override
	public boolean noOvertaking() {
		System.out.println("Running noOvertaking");
		return true;
	}

	@Override
	public boolean noHonking() {
		System.out.println("Running noHonking");
		return false;
	}

	@Override
	public boolean useHeadlights() {
		System.out.println("Running useHeadlights");
		return true;
	}

	@Override
	public boolean obeyStopSigns() {
		System.out.println("Running obeyStopSigns");
		return true;
	}

	@Override
	public boolean managingTrafficFlow() {
		System.out.println("Running managingTrafficFlow");
		return true;
	}
	
	

}
