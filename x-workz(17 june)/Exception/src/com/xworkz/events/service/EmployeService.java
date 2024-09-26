package com.xworkz.events.service;

import com.xworkz.events.exception.InvalidAmountException;
import com.xworkz.events.exception.InvalidMailException;

public class EmployeService {

	public void save(String email) throws InvalidMailException {

		String regex = "^@.*\\.com$";

		if (email.equals(regex)) {
			System.out.println("invalid data,stop execution:");

			throw new InvalidMailException();
		}

		System.out.println("valid data,continue execution:" + email);
	}

	public void check(int price) {
		if (price < 100) {
			System.out.println("valid price:" + price);

		} else {

			System.out.println("invalid price");
			throw new InvalidAmountException();

		}
	}

}
