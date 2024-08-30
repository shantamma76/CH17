package com.xworkz.gun.runner;

import com.xworkz.gun.things.Bhagya;
import com.xworkz.gun.things.Freezer;
import com.xworkz.gun.things.Renuka;
import com.xworkz.gun.things.Shanta;
import com.xworkz.gun.things.Sohita;

public class FreezerRunner {

	public static void main(String[] args)
	{
		Shanta shanta=new Shanta();
	    shanta.cold();
		
		Sohita sohita=new Sohita();
		Freezer freezer=new Freezer("HP","Pink",50000);
		sohita.icecube(freezer);
		
		Freezer freezer1=new Freezer("Lenova","Black",55000);
		Renuka renuka=new Renuka(freezer1);
		renuka.display();
		
		Bhagya bhagya=new Bhagya();
		Freezer ref=bhagya.low();
		if(ref!=null)
		{
			ref.cool();
			ref.show();
		}
		else {
			System.out.println("ref is null");
		}
		}

		
		
	}

