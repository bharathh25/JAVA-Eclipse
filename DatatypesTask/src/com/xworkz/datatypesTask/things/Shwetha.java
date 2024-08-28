package com.xworkz.datatypesTask.things;

public class Shwetha {
	
	public void drink(WaterBottle waterBottle) {
		
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
