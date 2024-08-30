package com.xworkz.gun.things;

public class Dboss {
	private Gun gun;
	
	public Dboss(Gun gun) {
		super();
		this.gun=gun;
	}

	public void show() {
		if (gun != null) {
			gun.fire();
			gun.display();
		} else {
			System.out.println("gun is null");
		}
	}
}
