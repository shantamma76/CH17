package com.xworkz.revati.runner;

import com.xworkz.revati.internal.MetroTrain;
import com.xworkz.revati.internal.SubUrbanTrain;

public class TrainRunner {
	
	public void main(String[] args) {
		MetroTrain metroTrain = new MetroTrain(150, "Kalaburgi");
		metroTrain.display();

		SubUrbanTrain subUrbanTrain = new SubUrbanTrain(200, "bangalore","Kalaburgi");
		subUrbanTrain.display();

	}

}



