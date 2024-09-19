package com.xworkz.repository.service;

import com.xworkz.standard.repository.AddressRepository;

public class AddressServiceImpl implements AddressService {

	 private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public String push() {
		System.out.println("Running push in AddressServiceImpl");

		if (addressRepository != null) {
			boolean ref1 = addressRepository.save();

			if (ref1) {
				System.out.println("push in addressRepository");
				return "success";
			} else {
				System.out.println("not Push in addressRepository");
				return "failure";
			}
		}
		return "issue";
	}

	@Override
	public String refresh() {
		System.out.println("Running refresh in AddressServiceImpl");
		if (addressRepository != null) {
			int value = addressRepository.update();
			if (value < 2) {
				System.out.println("Refresh in addressRepository");
				return "Success";
			} else {
				System.out.println("not refresh in addressRepository");
				return "Failure";
			}
		}
		return "Issues";
	}

	@Override
	public String remove() {
		System.out.println("Running remove in AddressServiceImpl");

		if (addressRepository != null) {
			 addressRepository.delete();
			 
			    System.out.println("load in addressRepository");
				return "Success";
			} else {
				System.out.println("Not load in addressRepository");
				return "Failure";
			}
		}
        

	@Override
	public String load() {
		System.out.println("Running load in AddressServiceImpl");

		if (addressRepository != null) {
			String read1= addressRepository.read();
			if (read1!=null ) {
				System.out.println("load in addressRepository");
				return "Success";
			} else {
				System.out.println("Not load in addressRepository");
				return "Failure";
			}
		}
         return "issues";
	}
	
}


