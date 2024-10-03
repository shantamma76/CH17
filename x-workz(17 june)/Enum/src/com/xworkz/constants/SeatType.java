package com.xworkz.constants;

public enum SeatType {

	RECLINER(17), PREMIUM(22), EXECUTIVE(30);

	private final int seatNo;

	private SeatType(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getSeatNo() {
		return seatNo;
	}

}
