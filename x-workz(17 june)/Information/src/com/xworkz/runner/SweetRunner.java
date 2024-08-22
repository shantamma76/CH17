package com.xworkz.runner;

import com.xworkz.information.Sweet;

public class SweetRunner {
	public static void main(String[] args)
	{
		Sweet sweet=new Sweet();
		sweet.showSweets();
		
		sweet.sugar("Golab Jamun");
		sweet.sugar("Gulkan");
		sweet.sugar("Rasgula");
		sweet.sugar("Mysore Paak");
		sweet.sugar("Cake");
		sweet.sugar("Kajju katli");
		sweet.sugar("Pastries");
		
		sweet.showSweets();
	}

}
