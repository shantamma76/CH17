package com.xworkz.practise.internal;

public class Weapon {
	
	public Weapon()
	{
		System.out.println("Running weapon using no-arg const");
	}
	
	protected void use()
	{
		System.out.println("running use in weapon");
	}
	
	public void fire()
	{
		System.out.println("running fire in weapon");
	}

}
