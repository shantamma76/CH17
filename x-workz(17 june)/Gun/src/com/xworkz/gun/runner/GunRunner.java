package com.xworkz.gun.runner;

import com.xworkz.gun.things.Dboss;
import com.xworkz.gun.things.Godse;
import com.xworkz.gun.things.Gun;
import com.xworkz.gun.things.Police;
import com.xworkz.gun.things.Soldier;

public class GunRunner {
	
	public static void main(String[] args)
	{
		Soldier soldier=new Soldier();
		soldier.fight();
		
		Police police=new Police();
		Gun gun = new Gun("ak47","india","rifle");
		police.theft(gun);
		
	
		Gun gun1 = new Gun("m16","UK","rifle");
		Dboss dboss=new Dboss(gun1);
		dboss.show();
		
		Godse godse=new Godse();
		Gun ref=godse.getGun();
		if(ref!=null) {
			ref.fire();
			ref.display();
		}else {
			System.out.println("ref is null");
		}
	}

}
