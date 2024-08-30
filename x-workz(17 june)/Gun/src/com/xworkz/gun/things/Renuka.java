package com.xworkz.gun.things;

public class Renuka {
	private Freezer freezer; //instannce variable
	
	public Renuka(Freezer freezer)
	{
		this.freezer=freezer;
	}
	
	public void display()
	{
		if(freezer!=null) {
			freezer.cool();
			freezer.show();
		}
		else {
			System.out.println("freezer is null");
		}
	}
}
