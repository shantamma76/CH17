package com.xworkz.events.runner;

import com.xworkz.events.service.EventStack;

public class EventStackRunner {
	
	public static void main(String[] args)
	{
		EventStack eventStack=new EventStack();
		eventStack.method1();
		System.out.println("method1 completed");
	}

}
