package com.xworkz.superchaining.chain;

public class Government {

	private String state;
	private int noOfMlas;
	private String partyHeadName;
	private String homeMinisterName;

	public Government(String state, int noOfMlas, String partyHeadName, String homeMinisterName) {
		super();
		this.state = state;
		this.noOfMlas = noOfMlas;
		this.partyHeadName = partyHeadName;
		this.homeMinisterName = homeMinisterName;
	}

	public Government(String state, String homeMinisterName) {
		super();
		this.state = state;
		this.homeMinisterName = homeMinisterName;
	}

	public void display() {

		if( state!= null && noOfMlas!=0 && partyHeadName!=null && homeMinisterName!=null) {
			System.out.println("State :"+state);
			System.out.println("Number of MLAs :"+noOfMlas);
			System.out.println("Party Head Name :"+partyHeadName);
			System.out.println("Home Minister Name :"+homeMinisterName);
			System.out.println("------------------");
		}
		else {
			System.out.println("State :"+state);
			System.out.println("Home Minister Name :"+homeMinisterName);
			System.out.println("------------------");

		}
	}

}
