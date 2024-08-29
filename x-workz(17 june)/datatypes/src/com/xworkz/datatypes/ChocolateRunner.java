package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Chocolate;
import com.xworkz.datatypes.things.Gowri;
import com.xworkz.datatypes.things.Jaanu;
import com.xworkz.datatypes.things.Radhika;

public class ChocolateRunner {
	
	public static void main(String[] args)
	{
		Radhika radhika=new Radhika();
		radhika.pandit();
		
		Jaanu jaanu=new Jaanu();
		Chocolate chocolate=new Chocolate();
		jaanu.jio(chocolate);
		
		Gowri gowri=new Gowri();
		Chocolate chocolate1=new Chocolate();
		gowri.chocolate=chocolate1;
		gowri.silent();
	}

}

