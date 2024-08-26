package com.xworkz.practice.data;

public class SandalData {
	private String brand;
	private int size;
	private String color;
	private double cost;

	public SandalData(String brand, int size, String color, double cost) {
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.cost = cost;
	}
	
	public void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Size: "+size);
		System.out.println("Color: "+color);
		System.out.println("Cost: "+cost);
		
	}

}