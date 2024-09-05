package com.xworkz.practise.internal;

public class Gun extends Weapon {
	
	public Gun()
	{
		super();
	}
	
	@Override
	public void use()
	{
		System.out.println("running use in Gun");
	}
	
	@Override
	public void fire()
	{
		System.out.println("running fire in Gun");
	}
	
	public void check()
	{
		use();
		fire();
	}

}
