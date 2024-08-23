package com.xworkz.MarketRunner;

import com.xworkz.Market.Market;
import com.xworkz.MarketStore.MarketStore;

public class MarketRunner {
	public static void main(String[] args)
	{
	MarketStore store=new MarketStore();
	store.show();
	
	Market data1=new Market("Super Market","Rajaji Nagar");
	Market data2=new Market("KR Market","Huriopet");
	Market data3=new Market("Chickpet Market","BVK Iyengar rd");
	Market data4=new Market("Gandhi bazar","Basavangudi");
	Market data5=new Market("Super Market","Rajaji Nagar");
	
	store.save(data1); 
	store.save(data2); 
	store.save(data3); 
	store.save(data4); 
	store.save(data5); 
	
	store.show();
	}
}
