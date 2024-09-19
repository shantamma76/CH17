package com.xworkz.repositary.runner;

import com.xworkz.repository.service.VehicleService;
import com.xworkz.repository.service.VehicleServiceImpl;
import com.xworkz.standard.repository.VehicleRepository;
import com.xworkz.standard.repository.VehicleRepositoryImple;

public class VehicleRepositoryRunner {
	public static void main(String[] args)
	{
		VehicleRepository vehicleRepository=new VehicleRepositoryImple();
		
		VehicleService vehicleService=new VehicleServiceImpl(vehicleRepository);
		
		String per=vehicleService.persist();
		System.out.println("persist return:"+per);
		System.out.println("===========================");
		
		String mer=vehicleService.merge();
		System.out.println("persist return:"+mer);
		System.out.println("===========================");
		
		String cle=vehicleService.clear();
		System.out.println("persist return:"+cle);
		System.out.println("===========================");
		
		String sea=vehicleService.search();
		System.out.println("persist return:"+sea);
		System.out.println("===========================");
		
		
	}

}
