package com.xworkz.superchaining.chain;

public class MetroTrain extends Train {

	public MetroTrain(int trainNumber, String destination) {
		super(trainNumber,destination);
		System.out.println("Running Metro Train with train number & destination");
	}

	public MetroTrain() {
		super("Bengaluru","Pondicherry");
		System.out.println("Running Metro Train with source & destination");
	}

	public MetroTrain(int trainNumber,String source, String destination) {
		super(trainNumber,source,destination);
		System.out.println("Running Metro Train with all 3 constructors");
	}
}
