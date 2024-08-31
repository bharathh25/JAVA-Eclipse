package com.xworkz.superchaining.runner;

import com.xworkz.superchaining.chain.MetroTrain;
import com.xworkz.superchaining.chain.SubUrbanTrain;
import com.xworkz.superchaining.chain.Train;

public class TrainRunner {

	public static void main(String[] args) {

		MetroTrain metroTrain = new MetroTrain(1435,"Delhi");
		metroTrain.display();

		MetroTrain metroTrain1 = new MetroTrain();
		metroTrain1.display();

		Train metroTrain2 = new MetroTrain(4352,"Bengaluru","Mysuru");
		metroTrain2.display();
		//----
		SubUrbanTrain subUrbanTrain = new SubUrbanTrain(3367,"Pune");
		subUrbanTrain.display();

		SubUrbanTrain subUrbanTrain1 = new SubUrbanTrain();
		subUrbanTrain1.display();

		Train subUrbanTrain2 = new SubUrbanTrain(4352,"Manglore","Bengaluru");
		subUrbanTrain2.display();
	}

}
