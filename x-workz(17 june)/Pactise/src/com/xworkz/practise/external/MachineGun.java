package com.xworkz.practise.external;

import com.xworkz.practise.internal.Weapon;

public class MachineGun extends Weapon {
	
	@Override
	protected void use()
	{
		System.out.println("running use in Gun");
	}
	
	@Override
	public void fire()
	{
		System.out.println("running fire in Gun");
	}
	
	public void verify()
	{
		use();
		fire();		
		
	}
	
	

}
