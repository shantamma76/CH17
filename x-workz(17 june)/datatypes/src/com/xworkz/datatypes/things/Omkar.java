package com.xworkz.datatypes.things;

public class Omkar {

	public void tear(Shoe shoe) // parameter
	{
		if (shoe != null) {
			shoe.safeGuard();
			shoe.enhanceWalk();
			System.out.println(shoe.brand);
			System.out.println(shoe.cost);
		} else {
			System.out.println(" omakar Shoe is null");
		}
	}

}

