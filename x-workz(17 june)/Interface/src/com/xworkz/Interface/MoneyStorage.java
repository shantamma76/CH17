package com.xworkz.Interface;

public class MoneyStorage implements BankCustomers {
	
	public MoneyStorage()
	{
		super();
		System.out.println("Running no-args in MoneyStorage");
	}

	@Override
	public boolean useStrongPasswords() {
		System.out.println("Running useStrongPasswords");
		return true;
	}

	@Override
	public boolean setUpAlerts() {
		System.out.println("Running setUpAlerts");
		return true;
	}

	@Override
	public boolean depositInsurance() {
		System.out.println("Running depositInsurance");
		return true;
	}

	@Override
	public boolean capitalRequirements() {
		System.out.println("Running capitalRequirements");
		return true;
	}

	@Override
	public boolean dataSecurity() {
		System.out.println("Running dataSecurity");
		return true;
	}

	@Override
	public boolean protection() {
		System.out.println("Running protection");
		return true;
	}

	@Override
	public boolean interestRateRegulations() {
		System.out.println("Running interestRateRegulations");
		return false;
	}

	@Override
	public boolean reserveRequirements() {
		System.out.println("Running reserveRequirements");
		return false;
	}

	@Override
	public boolean bankSecrucy() {
		System.out.println("Running bankSecrucy");
		return true;
	}

	@Override
	public boolean depositeAccount() {
		System.out.println("Running depositeAccount");
		return true;
	}

	@Override
	public boolean lendingLimits() {
		System.out.println("Running lendingLimits");
		return false;
	}

	@Override
	public boolean lendingPractices() {
		System.out.println("Running lendingPractices");
		return true;
	}

	@Override
	public boolean limitedLoans() {
		System.out.println("Running limitedLoans");
		return true;
	}

	@Override
	public boolean noSmokeing() {
		System.out.println("Running noSmokeing");
		return true;
	}

	@Override
	public boolean donotNoise() {
		System.out.println("Running donotNoise");
		return false;
	}

	@Override
	public boolean staffManagement() {
		System.out.println("Running staffManagement");
		return true;
	}
	
	

}
