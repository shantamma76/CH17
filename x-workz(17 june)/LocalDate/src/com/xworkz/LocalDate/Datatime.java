package com.xworkz.LocalDate;

import java.time.LocalDateTime;

public class Datatime {

	public static void main(String[] args) {
		System.out.println("Running Data time in Runner");

		LocalDateTime pastDateTime = LocalDateTime.of(1995, 04, 30, 05, 30, 20); // Dec 31,1999 23:59:59
		System.out.println("Past DateTime:" + pastDateTime);

		LocalDateTime futureDateTime = LocalDateTime.of(2002, 12, 06, 12, 30, 15); // Jan 1,2100 00:00:00
		System.out.println("Future DateTime:" + futureDateTime);

	}
}
