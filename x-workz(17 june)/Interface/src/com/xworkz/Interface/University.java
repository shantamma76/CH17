package com.xworkz.Interface;

public class University implements Students {

	public University() {
		super();
		System.out.println("Running No-Arg const..");
	}

	@Override
	public int minimumAttendance() {
		System.out.println("Running minimumAttendance");
		return 75;
	}

	@Override
	public String dressCode() {
		System.out.println("Running dressCode");
		return "Uniform";
	}

	@Override
	public String allowMobiles() {
		System.out.println("Running allowMobiles");
		return "No";
	}

	@Override
	public boolean maintaingSilence() {
		System.out.println("Running maintaingSilence");
		return false;
	}

	@Override
	public boolean academicIntegrity() {
		System.out.println("Running academicIntegrity");
		return true;
	}

	@Override
	public int rollNo() {
		System.out.println("Running rollNo");
		return 017;
	}

	@Override
	public boolean campusSafety() {
		System.out.println("Running campusSafety");
		return true;
	}

	@Override
	public String emergencyProcedures() {
		System.out.println("Running emergencyProcedures");
		return "Available";
	}

	@Override
	public boolean parkingRegulations() {
		System.out.println("Running parkingRegulations");
		return true;
	}

	@Override
	public boolean respectForProperty() {
		System.out.println("Running respectForProperty");
		return true;
	}

	@Override
	public boolean collegeManagement() {
		System.out.println("Running collegeManagement");
		return true;
	}

}
