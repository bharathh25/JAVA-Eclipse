package com.xworkz.datatypesClasses.things;

public class WashingMachine {
	
	private String brand;
	private String type;
	private double capacity;

	public WashingMachine() {
		System.out.println("Created a washing machine constructor with no parameter");
	}

	public WashingMachine(String brand, String type, double capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	public void rinse() {
		System.out.println("Running Rinse in Washing Machine");
	}

	public void show() {
		System.out.println("Brand :"+brand);
		System.out.println("Type :"+type);
		System.out.println("Capacity :"+capacity);
		System.out.println("------------------");

	}

}
