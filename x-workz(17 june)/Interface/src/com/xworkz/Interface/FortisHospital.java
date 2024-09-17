package com.xworkz.Interface;

public class FortisHospital implements GovHospitalRule  {
	
	public FortisHospital() {
		super();
		System.out.println("no-arg const FortisHospital");
	}

	@Override
	public boolean maintSilence()
	{
		System.out.println("running maintSilence");
		return true;
	}
	
	@Override
	public int visitorAllowed()
	{
		System.out.println("running visitorAllowed");
		return 1;
	}
	
	@Override
	public boolean provideEmergencyService()
	{
		System.out.println("running provideEmergencyService");
		return true;
	}

	@Override
	public boolean serve() {
		System.out.println("running serve");
		return false;
	}
	
}
