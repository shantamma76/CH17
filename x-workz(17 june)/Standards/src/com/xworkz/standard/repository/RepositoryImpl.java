package com.xworkz.standard.repository;

public class RepositoryImpl implements Repository {
	
	public RepositoryImpl()
	{
		System.out.println("Running no-arg const in RepositoryImpl");
	}

	@Override
	public boolean save() {
	System.out.println("running save in RepositoryImpl");
		return false;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}


}
