package com.xworkz.gun.things;

public class Lakshmi {
	
	public void soak(WashingMachine machine)
	{
		if(machine!=null)
		{
			machine.rinse();
			machine.show();
		}
		else {
			System.out.println("machine is null");
		}
	}

}
