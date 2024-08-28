package com.xworkz.datatypesTask.things;

public class Devu {
	
	public WaterBottle waterBottle;
	
	public void liquid() {
		if(waterBottle!=null) {
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println(waterBottle.colour);
			System.out.println(waterBottle.quantity);
		}
		
		else {
			System.out.println("WaterBottle is null");
		}
	}

}
