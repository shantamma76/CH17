package com.xworkz.datatypes.things;

public class Divya {

	public void wear()
	{
		Shoe shoe=new Shoe(); //local variable
		System.out.println(shoe.brand);
		System.out.println(shoe.cost);
		
		shoe.safeGuard();
		shoe.enhanceWalk();
		
	}
}
