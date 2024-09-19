package com.xworkz.standard.repository;

public class MachineRepositoryImpl implements MachineRepository  {

	@Override
	public void save() {
		System.out.println("Running save in MachineRepositoryImpl");
		
	}

	@Override
	public int update() {
		System.out.println("Running update in MachineRepositoryImpl");
		return 0;
	}

	@Override
	public int delete() {
		System.out.println("Running delete in MachineRepositoryImpl");
		return 0;
	}

	@Override
	public int read() {
		System.out.println("Running read in MachineRepositoryImpl");
		return 0;
	}

}
