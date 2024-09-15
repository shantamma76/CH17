package com.xworkz.runner;

import com.xworkz.jeans.Kettle;

public class KettleRunner {
	
	public static void main(String[] args)
	{
		Kettle kettle=new Kettle("LG",100,500);
		Kettle kettle1=new Kettle("prestige",105,800);
		
		System.out.println(kettle.toString());
        System.out.println(kettle1.toString());
        
        System.out.println("kettle equals kettle1:"+kettle.equals(kettle1));
		
		
	}

}
