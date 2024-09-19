package com.xworkz.repository.service;

import com.xworkz.standard.repository.MachineRepository;

public class MachineServiceImpl implements MachineService {
	private MachineRepository machineRepository;

	public MachineServiceImpl(MachineRepository machineRepository) {
		this.machineRepository = machineRepository;
	}

	@Override
	public String save() {
		System.out.println("Running save in MachineServiceImpl");

		if (machineRepository != null) {
			machineRepository.save();
			System.out.println("refer in save");
			return "Success";
		} else {
			System.out.println("not refer in save");
			return "Failure";

		}
	}

	@Override
	public String update() {
		System.out.println("Running update in MachineServiceImpl");
		if (machineRepository != null) {
			int value = machineRepository.update();
			if (value < 1) {
				System.out.println("value in machineRepository");
				return "Success";
			} else {
				System.out.println("Not value in machineRepository");
				return "Failure";
			}
		}
		return "issues";
	}

	@Override
	public String delete() {
		System.out.println("Running delete in MachineServiceImpl");
		if (machineRepository != null) {
			int value1 = machineRepository.update();
			if (value1 < 2) {
				System.out.println("value1 in machineRepository");
				return "Success";
			} else {
				System.out.println("Not value1 in machineRepository");
				return "Failure";
			}
		}
		return "issues";
	}

	@Override
	public String read() {
		System.out.println("Running read in MachineServiceImpl");
		if (machineRepository != null) {
			int value2 = machineRepository.update();
			if (value2 < 3) {
				System.out.println("value2 in machineRepository");
				return "Success";
			} else {
				System.out.println("Not value2 in machineRepository");
				return "Failure";
			}
		}
		return "issues";
	}

}
