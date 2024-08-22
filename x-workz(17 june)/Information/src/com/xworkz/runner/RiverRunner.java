package com.xworkz.runner;

import com.xworkz.information.River;

public class RiverRunner {
	public static void main(String[] args)
	{
		River river =new River();
	    river.display();
	    
	    river.water("Krishna");
	    river.water("Godavari");
	    river.water("Ganga");
	    river.water("Kaveri");
	    river.water("Brahmaputra");
	    river.water("Yamuna");
	    river.water("Narmada");
	    
	    river.display();
		
	}

}

