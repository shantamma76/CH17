package com.xworkz.LocalDate;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		System.out.println("Running Local Date in Runner");

		LocalDate pastDate = LocalDate.of(2002, 12, 06); // December 06,2002
		System.out.println("Past Date:" + pastDate);

		LocalDate futurDate = LocalDate.of(2025, 01, 8); // January 08, 2000
		System.out.println("Futur Date:" + futurDate);
	}

}


