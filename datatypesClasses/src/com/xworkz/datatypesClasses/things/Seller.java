package com.xworkz.datatypesClasses.things;

public class Seller {
	
	public void sell(Laptop laptop) {

		if(laptop!=null) {
			laptop.code();
			laptop.output();
		}
		else {
			System.out.println("Laptop is null");
		}
	}

}
