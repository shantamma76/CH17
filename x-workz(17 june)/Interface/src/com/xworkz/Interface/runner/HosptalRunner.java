package com.xworkz.Interface.runner;

import com.xworkz.Interface.FortisHospital;

public class HosptalRunner {
	
	public static void main(String[] args)
	{
		FortisHospital govHospitalRule=new FortisHospital();
		govHospitalRule.maintSilence();
		govHospitalRule.visitorAllowed();
		govHospitalRule.provideEmergencyService();
		govHospitalRule.serve();
	}

}
