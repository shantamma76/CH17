package com.xworkz.repository.service;

import com.xworkz.standard.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {
	private VehicleRepository vehicleRepository;

	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;

	}

	@Override
	public String persist() {
		System.out.println("Running persist in VehicleServiceImpl");
		if (vehicleRepository != null) {
			vehicleRepository.save();
			System.out.println("ref in vehicleRepository");
			return "Success";
		} else {
			System.out.println("not ref in vehicleRepository");
			return "Failure";
		}

	}

	@Override
	public String merge() {
		System.out.println("Running merge in VehicleServiceImpl");

		if (vehicleRepository != null) {
			vehicleRepository.update();
			System.out.println("result in vehicleRepository");
			return "Success";
		} else {
			System.out.println("not result in vehicleRepository");
			return "Failure";
		}

	}

	@Override
	public String clear() {
		System.out.println("Running clear in VehicleServiceImpl");

		if (vehicleRepository != null) {
			boolean del = vehicleRepository.delete();
			if (del) {
				System.out.println("result in vehicleRepository");
				return "Success";
			} else {
				System.out.println("not result in vehicleRepository");
				return "Failure";
			}
		}
		return "Issues";

	}

	@Override
	public String search() {
		System.out.println("Running search in VehicleServiceImpl");

		if (vehicleRepository != null) {
			String red = vehicleRepository.read();
			if (red != null) {
				System.out.println("red in vehicleRepository");
				return "Success";
			} else {
				System.out.println("not red in vehicleRepository");
				return "Failure";
			}
		}
		return "Issues";

	}

}
