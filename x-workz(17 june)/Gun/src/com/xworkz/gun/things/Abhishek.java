package com.xworkz.gun.things;

public class Abhishek {
	
	private WashingMachine machine;
	
	public Abhishek(WashingMachine machine)
	{
		super();
		this.machine=machine;
	}
	
	public void show() 
	{
		if(machine!=null) {
			machine.rinse();
			machine.show();
		}
		else {
			System.out.println(" abhishek machine is null");
		}
	}

}
