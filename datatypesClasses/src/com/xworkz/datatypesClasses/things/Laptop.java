package com.xworkz.datatypesClasses.things;

public class Laptop {
	
	private String brand;
	private double price;
	private int storage;

	public Laptop() {
		System.out.println("Created a Laptop constructor with no parameter");
	}

	public Laptop(String brand, double price, int storage) {
		super();
		this.brand = brand;
		this.price = price;
		this.storage = storage;
	}

	public void code() {
		System.out.println("Running Code in Laptop");
	}

	public void output() {
		System.out.println("Brand :"+brand);
		System.out.println("Price :"+price);
		System.out.println("Storage :"+storage);
		System.out.println("------------------");
	}


}
