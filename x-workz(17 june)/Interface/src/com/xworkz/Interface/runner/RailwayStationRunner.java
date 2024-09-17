package com.xworkz.Interface.runner;

import com.xworkz.Interface.Trains;

public class RailwayStationRunner {

	public static void main(String[] args)
	{
		Trains passangers=new Trains();
		passangers.validTicketRequired();
		passangers.followPlatformSigns();
		passangers.noSmoking();
		passangers.noRunning();
		passangers.noAlcoholic();
		passangers.followSecurityChecks();
		passangers.noLittering();
		passangers.queueUp();
		passangers.obeySafetySignals();
		passangers.assistDisabled();
		passangers.reportSuspiciousActivities();
		passangers.obeyTrainEtiquette();
		passangers.noUnauthorizedPhotography();
		passangers.respectReservedSeating();
		passangers.followAnnouncements();
		passangers.ticketVerification();
	}
}
