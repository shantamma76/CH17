package com.xworkz.Interface;

public class Trains implements Passangers {

	public Trains() {
		super();
		System.out.println("Running no-arg in Trains");
	}

	@Override
	public boolean validTicketRequired() {
		System.out.println("Running in validTicketRequired");
		return true;
	}

	@Override
	public boolean followPlatformSigns() {
		System.out.println("Running in followPlatformSigns");
		return true;
	}

	@Override
	public boolean noSmoking() {
		System.out.println("Running in noSmoking");
		return false;
	}

	@Override
	public boolean noRunning() {
		System.out.println("Running in noRunning");
		return false;
	}

	@Override
	public boolean noAlcoholic() {
		System.out.println("Running in noAlcoholic");
		return false;
	}

	@Override
	public boolean followSecurityChecks() {
		System.out.println("Running in followSecurityChecks");
		return true;
	}

	@Override
	public boolean noLittering() {
		System.out.println("Running in noLittering");
		return false;
	}

	@Override
	public boolean queueUp() {
		System.out.println("Running in queueUp");
		return false;
	}

	@Override
	public boolean obeySafetySignals() {
		System.out.println("Running in obeySafetySignals");
		return true;
	}

	@Override
	public boolean assistDisabled() {
		System.out.println("Running in obeySafetySignals");
		return false;
	}

	@Override
	public boolean reportSuspiciousActivities() {
		System.out.println("Running in obeySafetySignals");
		return true;
	}

	@Override
	public boolean obeyTrainEtiquette() {
		System.out.println("Running in obeyTrainEtiquette");
		return false;
	}

	@Override
	public boolean noUnauthorizedPhotography() {
		System.out.println("Running in noUnauthorizedPhotography");
		return true;
	}

	@Override
	public boolean respectReservedSeating() {
		System.out.println("Running in respectReservedSeating");
		return true;
	}

	@Override
	public boolean followAnnouncements() {
		System.out.println("Running in followAnnouncements");
		return false;
	}

	@Override
	public boolean ticketVerification() {
		System.out.println("Running in Ticketverification");
		return true;
	}

}

