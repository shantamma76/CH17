package com.xworkz.rules.media;

public class Shopping {
	
	private MallRule mallRule;
	
	public void setMallRule(MallRule mallRule)
	{
		this.mallRule=mallRule;
		System.out.println("Running setMallRule in shopping");
	}
	
	public void display()
	{
		System.out.println("running display in Shopping");
		
		if(mallRule!=null)
		{
			mallRule.validId();
			System.out.println("MallRule is not null");
		} else {
			System.out.println("MallRule is null");
		}
	}

}
