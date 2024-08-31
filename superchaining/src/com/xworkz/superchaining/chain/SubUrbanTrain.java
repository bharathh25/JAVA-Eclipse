package com.xworkz.superchaining.chain;

public class SubUrbanTrain extends Train{

	public SubUrbanTrain(int trainNumber, String destination) {
		super(trainNumber,destination);
		System.out.println("Running Sub-Urban Train with train number & destination");
	}

	public SubUrbanTrain() {
		super("Bengaluru","Goa");
		System.out.println("Running Sub-Urban Train with source & destination");
	}

	public SubUrbanTrain(int trainNumber,String source,String destination) {
		super(trainNumber,source,destination);
		System.out.println("Running Sub-Urban Train with all 3 constructors");
	}

}
