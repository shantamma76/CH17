package com.xworkz.gun.things;

public class Police {
	
	public void theft(Gun gun)
	{
		System.out.println("running theft in police");
		if(gun!=null)
		{
		 gun.fire();
		 gun.display();
		}
		else {
			System.out.println("gun is null");
		}
	}

}
