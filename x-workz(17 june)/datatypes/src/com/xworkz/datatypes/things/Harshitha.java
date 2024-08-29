package com.xworkz.datatypes.things;

public class Harshitha {
	public Shoe shoe; //instance

	public void fold() {
		if (shoe != null) {
			shoe.safeGuard();
			shoe.enhanceWalk();
			System.out.println(shoe.brand);
			System.out.println(shoe.cost);
		} else {
			System.out.println(" harshita Shoe is null ");

		}
	}
}
