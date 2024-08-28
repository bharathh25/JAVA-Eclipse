package com.xworkz.datatypesTask.things;

public class Shoe {
	
	public String brand="PUMA";
	public double price=12789;

	public Shoe() {
		System.out.println("Created Shoe constructor with no parameter");
	}

	public void safeguard() {
		System.out.println("Running safeguard in shoe");
	}

	public void enhance() {
		System.out.println("Running enhance in shoe");
	}

}
