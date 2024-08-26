package com.xworkz.practice.store;

import com.xworkz.practice.data.SandalData;

public class SandalDataStore {

	
	private SandalData[] sandals=new SandalData[5];
	private int index;
	
public void store(SandalData sandals) {
	this.sandals[this.index]=sandals;
	this.index++;

}

public void show() {
	for(SandalData sandal:sandals) {
		if(sandal!=null) {
		sandal.display();
		}
		else {
			System.out.println("Null Data");
		}
	}
}

}