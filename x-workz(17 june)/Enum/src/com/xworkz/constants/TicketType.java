package com.xworkz.constants;

public enum TicketType {

	ONLINE(250), OFFLINE(260);

	private final double cost;

	private TicketType(double cost) {
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}

}
