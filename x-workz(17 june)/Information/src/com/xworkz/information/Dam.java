package com.xworkz.information;

public class Dam {
	private String[] damNames= new String[7];
	private int index=0;
	
	public void bridge(String name)
	{
		System.out.println("Running bridge in Dam");
		this.damNames[this.index]=name;
		this.index++;
	}
	
	public void display()
	{
		System.out.println("Running display in Dam");
		for(String ref:this.damNames)
		{
			System.out.println("dam names:"+ref);
		}
	}

}
