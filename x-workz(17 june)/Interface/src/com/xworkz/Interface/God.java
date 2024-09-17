package com.xworkz.Interface;

public class God implements Believers {
	
	public God() {
		super();
		System.out.println("Running No-Arg in God");
	}

	@Override
	public String dressCode() {
		System.out.println("Running dressCode");
		return "Treaditional";
	}

	@Override
	public boolean removeShoes() {
		System.out.println("Running removeShoes");
		return true;
	}

	@Override
	public boolean maintainSilence() {
		System.out.println("Running maintainSilence");
		return true;
	}

	@Override
	public boolean noPhotography() {
		System.out.println("Running noPhotography");
		return true;
	}

	@Override
	public boolean silenceMobiles() {
		System.out.println("Running noPhotography");
		return true;
	}

	@Override
	public boolean Cleanliness() {
		System.out.println("Running Cleanliness");
		return false;
	}

	@Override
	public String Behavior() {
		System.out.println("Running Behavior");
		return "believe in god";
	}

	@Override
	public boolean respectDeities() {
		System.out.println("Running respectDeities");
		return true;
	}

	@Override
	public boolean respectPersonalSpace() {
		System.out.println("Running respectPersonalSpace");
		return false;
	}

	@Override
	public boolean washleges() {
		System.out.println("Running washleges");
		return true;
	}

	@Override
	public boolean worship() 
	{
		System.out.println("Running washleges");
		return true;
	}

}
