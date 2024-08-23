package com.xworkz.SandalRunner;

import com.xworkz.Sandal.Sandal;
import com.xworkz.SandalStore.SandalStore;

public class SandalRunner {
	public static void main(String[] args)
	{
		SandalStore sandalStore=new SandalStore();
		sandalStore.show();
		
		Sandal data1=new Sandal("walkment",'m',300,"pink");
		Sandal data2=new Sandal("paragan",'S',250,"Red");
		Sandal data3=new Sandal("Bata",'L',350,"black");
		Sandal data4=new Sandal("nisolo",'X',450,"blue");
		Sandal data5=new Sandal("Chaco",'L',500,"Purple");
		
		sandalStore.save(data1);
		sandalStore.save(data2);
		sandalStore.save(data3);
		sandalStore.save(data4);
		sandalStore.save(data5);
		
		sandalStore.show();
	}
	

}
