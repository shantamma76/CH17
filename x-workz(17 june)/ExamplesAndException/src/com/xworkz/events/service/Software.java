package com.xworkz.events.service;

import com.xworkz.events.exception.Computer;

public class Software {
	
	public void print(String computerBrand) throws Computer {
		System.out.println("Running print in Software");
		
		if(computerBrand==null || computerBrand.equals("")) {
			//stop the exception
			System.out.println("invalid data,will stop the execution");
			throw new Computer();
		}
		
		//continue execution
		System.out.println("Valid data will continue execution");
	}

}
