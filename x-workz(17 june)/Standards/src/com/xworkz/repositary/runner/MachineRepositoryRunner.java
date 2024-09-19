package com.xworkz.repositary.runner;

import com.xworkz.repository.service.MachineService;
import com.xworkz.repository.service.MachineServiceImpl;
import com.xworkz.standard.repository.MachineRepository;
import com.xworkz.standard.repository.MachineRepositoryImpl;

public class MachineRepositoryRunner {

	public static void main(String[] args) {
		MachineRepository machineRepository = new MachineRepositoryImpl();

		MachineService machineService = new MachineServiceImpl(machineRepository);

		String sav = machineService.save();
		System.out.println("Save returns:" + sav);
		System.out.println("===========================");

		String updat = machineService.update();
		System.out.println("update returns:" + updat);
		System.out.println("===========================");

		String del = machineService.delete();
		System.out.println("delete returns:" + del);
		System.out.println("===========================");

		String rea = machineService.read();
		System.out.println("read returns:" + rea);
		System.out.println("===========================");

	}

}

