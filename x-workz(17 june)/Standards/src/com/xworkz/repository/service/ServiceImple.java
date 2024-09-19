package com.xworkz.repository.service;

import com.xworkz.standard.repository.Repository;

public class ServiceImple implements Service  {
	
	private Repository repository;
	
	public ServiceImple( Repository repository)
	{
		this.repository=repository;
		System.out.println("repository param const in seviceImple");
	}
	

	@Override
	public String push() {
		System.out.println("Running push in serviceImple");
		
		if(repository!=null) {
			boolean save=repository.save();
			if(save) {
				System.out.println("saved in repo");
				return "Success";
			} else {
				System.out.println("not saved in repo");
				return "Failure";
			}
			
		}
		return "Issue";
	}


	@Override
	public String refresh() {
		System.out.println("Running refresh in serviceImple");
		
		if(repository!=null) {
			int value=repository.update();
			if(value<1)
			{
				System.out.println("upadte failure value::"+value);
				return "Failure";
			}else {
				System.out.println("upadate succ value:"+value);
				return "Succuss";
			}
		}
		return "Issue";
	}
	
	

}
