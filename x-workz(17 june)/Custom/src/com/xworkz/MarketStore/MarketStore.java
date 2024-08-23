package com.xworkz.MarketStore;

import com.xworkz.Market.Market;

public class MarketStore {
	private Market[] datas = new Market[5];
	private int index = 0;

	public void save(Market data) {
		this.datas[this.index] = data;
		this.index++;
	}

	public void show() {
		System.out.println("Running show in marketstore");
		for (Market ref : this.datas) {
			if (ref != null) {
				ref.display();
			} else {
				System.out.println("ref is null");
			}
		}
	}

}
