package com.xworkz.runner;

import com.xworkz.information.Dam;

public class DamRunner {
	public static void main(String[] args)
	{
		Dam dam=new Dam();
		dam.display();
		
		dam.bridge("Krishna Raja Sagar");
		dam.bridge("Almatti ");
		dam.bridge("Tungabhadra");
		dam.bridge("Supa");
		dam.bridge("Hemavati");
		dam.bridge("Vani Vilasa Sagara");
		dam.bridge("Kabini");
		
		dam.display();
}

}
