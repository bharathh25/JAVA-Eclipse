package com.xworkz.datatypesClasses.things;

public class Student {
	
	public Laptop laptop;
	
	public void study() {
		
		if(laptop!=null) {
			laptop.code();
			laptop.output();
		}
		else {
			System.out.println("Laptop is null");
		}
	}

}
