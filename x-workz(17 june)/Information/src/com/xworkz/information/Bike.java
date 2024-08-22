package com.xworkz.information;

public class Bike {
	
	private String[] names = new String[7];
	private int index = 0;

	public void same(String name) {
		System.out.println("running the same in  bike");
		this.names[this.index] = name;
		this.index++;
	}

	public void showNames() {
		System.out.println("running the showNames in same");
		
		for (String name : this.names) {
			System.out.println("Name:" + name);
		}
	}

}
