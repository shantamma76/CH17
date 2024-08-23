package com.xworkz.SideDishStore;

import com.xworkz.SideDish.SideDish;

public class SideDishStore {

	private SideDish[] datas = new SideDish[5];
	private int index = 0;

	public void save(SideDish data) {
		System.out.println("Running save in side dish store");
		this.datas[this.index] = data;
		this.index++;
	}

	public void show() {
		System.out.println("running show in market store");
		for (SideDish data : this.datas) {
			if (data != null) {
				data.display();
			} else {
				System.out.println("data is null");
			}
		}
	}
}
