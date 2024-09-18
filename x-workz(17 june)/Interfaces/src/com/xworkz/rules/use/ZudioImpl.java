package com.xworkz.rules.use;

import com.xworkz.rules.media.MallRule;

public class ZudioImpl implements MallRule {

	@Override
	public boolean validId() {
		System.out.println("Running validId in ZudioImpl");
		return false;
	}

}
