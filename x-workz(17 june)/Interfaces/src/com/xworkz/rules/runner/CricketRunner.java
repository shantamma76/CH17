package com.xworkz.rules.runner;

import com.xworkz.rules.media.BCCI;
import com.xworkz.rules.media.CricketRule;
import com.xworkz.rules.use.KACricketRuleImp;

public class CricketRunner {

	public static void main(String[] args)
	{
		CricketRule cricketRule=new KACricketRuleImp();
		
		BCCI bcci=new BCCI();
		bcci.setCricketRule(cricketRule);
		bcci.check();
		
	}
}
