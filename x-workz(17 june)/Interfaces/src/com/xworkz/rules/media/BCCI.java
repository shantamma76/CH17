package com.xworkz.rules.media;

public class BCCI {
	
	private CricketRule cricketRule;
	
	public void setCricketRule(CricketRule cricketRule)
	{
		this.cricketRule=cricketRule;
	}
	
	public void check() {
		System.out.println("running check in BCCI");
		if(cricketRule!=null)
		{
			System.out.println("Cricket is not null");
			cricketRule.powerplay();
		} else {
			System.out.println("Cricket is null");
		}
	}

}
