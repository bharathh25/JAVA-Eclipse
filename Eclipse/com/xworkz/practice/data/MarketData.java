package com.xworkz.practice.data;

public class MarketData {
	private String name;
	private String location;
	
	public MarketData(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public void print() {
		System.out.println("Name: "+name);
		System.out.println("Location: "+location);
	}
	


}
