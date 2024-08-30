package com.xworkz.gun.runner;

import com.xworkz.gun.things.Abhishek;
import com.xworkz.gun.things.Bhukima;
import com.xworkz.gun.things.Lakshmi;
import com.xworkz.gun.things.Megha;
import com.xworkz.gun.things.Nayana;
import com.xworkz.gun.things.WashingMachine;

public class MachineRunner {
	public static void main(String[] args) {
		Megha megha = new Megha();
		megha.wash();

		Lakshmi laxmi = new Lakshmi();
		WashingMachine machine = new WashingMachine("LG", "front load model", 150);
		laxmi.soak(machine);

		WashingMachine machine1 = new WashingMachine("Lenova", "all-in-one", 200);
		Abhishek abhishek = new Abhishek(machine1);
		abhishek.show();

		Bhukima bhukima = new Bhukima();
		WashingMachine ref = bhukima.water();
		if (ref != null) {
			ref.rinse();
			ref.show();
		} else {
			System.out.println("Ref is null");
		}
		
		Nayana nayana=new Nayana();
		nayana.clean();
		
	}

}
