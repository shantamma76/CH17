package com.xworkz.SandalStore;

import com.xworkz.Sandal.Sandal;

public class SandalStore {
	private Sandal[] datas = new Sandal[5];
	private int index = 0;

	public void save(Sandal data) {
		System.out.println("running save in sandalstore");
		this.datas[this.index] = data;
		this.index++;
	}

	public void show() {
		System.out.println("Running show in sandal store");
		for (Sandal data : this.datas) {
			if (data != null) {
				data.display();
			} else {
				System.out.println("data is null");

			}
		}
	}

}
