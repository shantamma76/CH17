package com.xworkz.revati.runner;

import com.xworkz.revati.internal.OnlineMarket;
import com.xworkz.revati.internal.SuperMarket;

public class MarketeRunner {
	public static void main(String[] args)
	{
		SuperMarket superMarket=new SuperMarket("radha","bangalore");
		superMarket.display();
		
		
		 OnlineMarket  onlineMarket=new  OnlineMarket("KR Market","bangalore",5,"store type");
		 onlineMarket.display();
		 
	}

}
