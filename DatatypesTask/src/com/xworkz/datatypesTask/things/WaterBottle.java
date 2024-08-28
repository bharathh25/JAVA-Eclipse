package com.xworkz.datatypesTask.things;

public class WaterBottle {
	
	public double quantity=1.5;
	public String colour="Black";
	
	public WaterBottle() {
		System.out.println("Created a waterbottle constructor with no parameter");
	}
	
	public void fill(){
		System.out.println("Running Fill in Waterbottle");
	}
	
	public void empty() {
		System.out.println("Running Empty in Waterbottle");
	}
	
	public void crush() {
		System.out.println("Running Crush in Waterbottle");
	}

}
