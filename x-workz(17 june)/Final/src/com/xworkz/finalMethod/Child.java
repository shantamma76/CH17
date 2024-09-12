package com.xworkz.finalMethod;

public class Child extends Parent {
	
	//it means that the method cannot be overridden by any subclasses
	
	public void check() {
	 System.out.println("Running child in parent");
}
}