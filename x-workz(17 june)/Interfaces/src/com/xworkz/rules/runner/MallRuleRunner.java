package com.xworkz.rules.runner;

import com.xworkz.rules.media.MallRule;
import com.xworkz.rules.media.Shopping;
import com.xworkz.rules.use.ZudioImpl;

public class MallRuleRunner {
	
	public static void main(String[] args) {
		
		MallRule mallRule=new ZudioImpl();
		
		
		Shopping shopping =new Shopping();
		shopping.setMallRule(mallRule);
		shopping.display();
	}

}
