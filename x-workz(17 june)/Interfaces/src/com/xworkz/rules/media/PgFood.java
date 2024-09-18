package com.xworkz.rules.media;

public class PgFood {
	
	private PGRule pgRule;
	
	public void setPGRule(PGRule pgRule)
	{
		this.pgRule=pgRule;
	}
	
	public void verify()
	{
		System.out.println("Running verify in PgFood");
		
		if(pgRule!=null)
		{
			pgRule.costPerMonth();
			pgRule.wifi();
			System.out.println("PGRule is not null");
		} else {
			System.out.println("PGRule is null");
		}
	}

}
