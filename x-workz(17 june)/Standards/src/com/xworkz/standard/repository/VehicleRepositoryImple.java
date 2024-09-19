package com.xworkz.standard.repository;

public class VehicleRepositoryImple implements VehicleRepository{

	@Override
	public void save() {
		System.out.println("Running save in VehicleRepositoryImple");
		
	}

	@Override
	public void update() {
		System.out.println("Running update in VehicleRepositoryImple");
		
	}

	@Override
	public boolean delete() {
		System.out.println("Running delete in VehicleRepositoryImple");
		return false;
	}

	@Override
	public String read() {
		System.out.println("Running read in VehicleRepositoryImple");
		return null;
	}

}
