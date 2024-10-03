
package com.xworkz.runner;

import com.xworkz.constants.Country;
import com.xworkz.constants.Qualification;
import com.xworkz.dto.RegisterDTO;

public class RegisterRunner {

	public static void main(String[] args) {

		RegisterDTO registerDTO = new RegisterDTO("Depak","atria",Qualification.BE,Country.INDIA);
		
		String name = registerDTO.getName();
		System.out.println("name:" + name);

		String collName = registerDTO.getCollegeName();
		System.out.println("college Name:" + collName);

		Qualification qualification = registerDTO.getQualification();
		System.out.println("qualification Name:" + qualification);

		System.out.println(registerDTO.getCountry().getCode());

	}
}


