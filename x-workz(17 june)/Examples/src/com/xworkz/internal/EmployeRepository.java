package com.xworkz.internal;

public interface EmployeRepository {
	
	void coding();
	
	//default methods in interface
	default int salary() {
		return 0;
	}

}


