package com.xworkz.superchaining.chain;

public class Train {

	private int trainNumber;
	private String source;
	private String destination;

	public Train(int trainNumber, String destination) {
		super();
		this.trainNumber = trainNumber;
		this.destination = destination;
	}

	public Train(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}

	public Train(int trainNumber,String source, String destination) {
		super();
		this.trainNumber = trainNumber;
		this.source = source;
		this.destination = destination;
	}

	public void display() {

		//conditions are used only to avoid printing null or 0
		if(trainNumber!=0 && source!=null && destination!= null) {

			System.out.println("Train Number :"+trainNumber);
			System.out.println("Source :"+source);
			System.out.println("Destination :"+destination);
			System.out.println("Displaying Info");
			System.out.println("------------------");

		}

		else if(source!=null && destination!= null) {
			System.out.println("Source :"+source);
			System.out.println("Destination :"+destination);
			System.out.println("Displaying Info");
			System.out.println("------------------");

		}

		else if(trainNumber!=0 && destination!= null ) {
			System.out.println("Train Number :"+trainNumber);
			System.out.println("Destination :"+destination);
			System.out.println("Displaying Info");
			System.out.println("------------------");

		}
	}
}


