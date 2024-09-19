package com.xworkz.repositary.runner;

import com.xworkz.repository.service.Service;
import com.xworkz.repository.service.ServiceImple;
import com.xworkz.standard.repository.Repository;
import com.xworkz.standard.repository.RepositoryImpl;

public class RepositoryRunner {
	
	public static void main(String[] args)
	{
		//repo first
		Repository repository=new RepositoryImpl();
		
		//service+assoc
		Service service=new ServiceImple(repository);
		//invoke
		String msg=service.push();
		System.out.println("push return:"+msg);
		System.out.println("===========================");
		
		String refreshMsg=service.refresh();
		System.out.println("refresh return:"+refreshMsg);
		
	}

}


