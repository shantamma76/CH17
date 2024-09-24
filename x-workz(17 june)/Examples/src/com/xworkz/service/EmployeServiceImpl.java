package com.xworkz.service;

import com.xworkz.internal.EmployeRepository;

public class EmployeServiceImpl {
	
	private EmployeRepository employeRepository;
	
	public EmployeServiceImpl(EmployeRepository employeRepository)
	{
		this.employeRepository=employeRepository;
		System.out.println("Running Constructore in EmployeServiceImpl");
	}
	
	public void display() {
		if(employeRepository!=null) {
			employeRepository.coding();
		}
	}

}
