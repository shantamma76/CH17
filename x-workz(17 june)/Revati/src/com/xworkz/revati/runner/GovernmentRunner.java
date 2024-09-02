package com.xworkz.revati.runner;

import com.xworkz.revati.internal.CentrlGovernmnet;
import com.xworkz.revati.internal.StateGovernment;

public class GovernmentRunner {
	
	public static void main(String[] args)
	{
		StateGovernment stateGovernment=new StateGovernment("Bangalore",10);
		stateGovernment.display();
		
		CentrlGovernmnet centrlGovernmnet=new CentrlGovernmnet("Karnatake",100,"Gouthamkumar","Gangadharaiah");
		centrlGovernmnet.display();
	}

}
