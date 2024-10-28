package com.xworkz.external;

import com.xworkz.internal.EmployeRepository;
import com.xworkz.internal.EmployeRepositoryImpl;
import com.xworkz.service.EmployeServiceImpl;

public class EmployeRunner {

	public static void main(String[] args) {

		EmployeRepository employeRepository = new EmployeRepositoryImpl();
		employeRepository.coding();

		EmployeServiceImpl employeServiceImpl = new EmployeServiceImpl(employeRepository);
		employeServiceImpl.display();
	}
}

