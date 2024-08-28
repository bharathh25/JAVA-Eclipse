package com.Inheritance.practice.store;

public class SmartPhone {
	
	public String brand;
	public int storage;
	public boolean ai;
	public double price;
	public String version;
	
	public SmartPhone() {
		System.out.println("created smart phone constructor.. ");
	}
	public void brandDetails() {
		System.out.println("smart phone brand:"+brand);
		System.out.println("smart phone ai:"+ai);
		System.out.println("smart phone price:"+price);
	}
	public void storageDetails() {
		System.out.println("smart phone storage:"+storage);
		System.out.println("smart phone version:"+version);
	}
	

}