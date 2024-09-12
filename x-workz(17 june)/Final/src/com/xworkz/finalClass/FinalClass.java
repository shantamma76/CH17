package com.xworkz.finalClass;

//Final Class

public class FinalClass {
	
	private String name;
	private int age;

    public FinalClass(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}


