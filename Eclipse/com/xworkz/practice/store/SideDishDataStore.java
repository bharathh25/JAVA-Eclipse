package com.xworkz.practice.store;

import com.xworkz.practice.data.SideDishData;

public class SideDishDataStore {

	private SideDishData[] sideDishes = new SideDishData[5];
	private int index;

	public void store(SideDishData sideDishes) {

		this.sideDishes[this.index] = sideDishes;
		this.index++;
	}

	public void show() {

		for (SideDishData data : sideDishes) {
			if (data != null) {

				data.display();
			} else {
				System.out.println("Null Data");
			}

		}
	}

}