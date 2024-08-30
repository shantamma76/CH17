package com.xworkz.gun.things;

public class Sohita {
	
	public void icecube(Freezer freezer) //parameter
	{
		if(freezer!=null)
		{
			freezer.cool();
			freezer.show();
		}
		else {
			System.out.println("freezer is null");
		}
	}

}
