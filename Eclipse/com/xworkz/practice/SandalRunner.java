package com.xworkz.practice;

import com.xworkz.practice.data.SandalData;
import com.xworkz.practice.store.SandalDataStore;

public class SandalRunner {

	public static void main(String[] args) {

		SandalDataStore sandalStore=new SandalDataStore();
		sandalStore.show();
		SandalData sandal1=new SandalData("Puma", 10, "White", 8000);
		sandal1.display();
		SandalData sandal2=new SandalData("Reebok", 7, "Black", 5600);
		sandal2.display();
		SandalData sandal3=new SandalData("Nike", 8, "White", 7800);
		sandal3.display();
		SandalData sandal4=new SandalData("Jordan", 10, "Red", 20000);
		sandal4.display();
		SandalData sandal5=new SandalData("Sparx", 7, "Blue", 2500);
		sandal5.display();
		
	}

}