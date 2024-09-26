package com.xworkz.events.runner;

import com.xworkz.events.exception.InvalidMailException;
import com.xworkz.events.service.EmployeService;

public class ExceptionRunner {

	public static void main(String[] args) throws InvalidMailException
	{
		EmployeService employeService=new EmployeService();
		
		System.out.println("running before check");
		employeService.check(20);  //un-checked event
		System.out.println("running after check");
		
		System.out.println("running before mail");
		employeService.save("shantamma@gmail.com");
		System.out.println("running after mail");
	}
}
