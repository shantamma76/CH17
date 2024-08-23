package com.xworkz.SideDishRunner;

import com.xworkz.SideDish.SideDish;
import com.xworkz.SideDishStore.SideDishStore;

public class SideDishRunner {
	
	public static void main(String[] args)
	{
		SideDishStore store=new SideDishStore();
		store.show();
		
		SideDish data1=new SideDish("ice reem",50,"cold");
		SideDish data2=new SideDish("chips",10,"snaks");
		SideDish data3=new SideDish("Pastre",25,"cold");
		SideDish data4=new SideDish("pikals",15,"Spicy");
		SideDish data5=new SideDish("Somosa",30,"Cripy");
		
		store.save(data1);
		store.save(data2);
		store.save(data3);
		store.save(data4);
		store.save(data5);
		
		store.show();
		}
	
}
