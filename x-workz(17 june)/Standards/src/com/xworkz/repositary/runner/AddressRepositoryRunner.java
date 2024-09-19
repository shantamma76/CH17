package com.xworkz.repositary.runner;

import com.xworkz.repository.service.AddressService;
import com.xworkz.repository.service.AddressServiceImpl;
import com.xworkz.standard.repository.AddressRepository;
import com.xworkz.standard.repository.AddressRepositoryImpl;

public class AddressRepositoryRunner {
	
	public static void main(String[] args)
	{
		AddressRepository addressRepository=new AddressRepositoryImpl();
		
		AddressService addressService = new AddressServiceImpl(addressRepository);
		
		String ref=addressService.push();
		System.out.println("push return:"+ref);
		System.out.println("===========================");
		
		String refers=addressService.refresh();
		System.out.println("refresh return:"+refers);
		System.out.println("===========================");
		
		String rem=addressService.remove();
		System.out.println("remove return:"+rem);
		System.out.println("===========================");
		
		String loads=addressService.load();
		System.out.println("load return:"+loads);
		System.out.println("===========================");
	}

}
