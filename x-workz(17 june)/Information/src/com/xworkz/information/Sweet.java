package com.xworkz.information;

public class Sweet {
	private String[] sweetNames = new String[7];
	private int index = 0;

	public void sugar(String name) {
		System.out.println("running sugar in sweet");
		this.sweetNames[this.index] = name;
		this.index++;
	}

	public void showSweets() {
		System.out.println("running showSweets in sweet");

		for (String list : this.sweetNames) {
			System.out.println("Sweet Name:" + list);
		}
	}

}
