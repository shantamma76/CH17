package com.xworkz.engineering;

public class SubmarineRunner {

	public static void main(String[] args) 
	{
		Submarine submarine1=new Submarine("Oceangate","USA","Cylindrical","invent",20000);
		Submarine submarine2=new Submarine("Arihant class","india","conical","protect",35000);
		Submarine submarine3=new Submarine(" Type 039C","china","Cylindrical","protect",25000);
		
		Submarine[] submarine=new Submarine[3];
		
		for(Submarine ref:submarine)
		{
			System.out.println(ref);
			submarine1.calculate();
			submarine2.calculate();
			submarine3.calculate();
		}
		
	}
	
	
	
}
