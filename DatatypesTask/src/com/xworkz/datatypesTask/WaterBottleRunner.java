package com.xworkz.datatypesTask;

import com.xworkz.datatypesTask.things.Devu;
import com.xworkz.datatypesTask.things.Gunashree;
import com.xworkz.datatypesTask.things.Shwetha;
import com.xworkz.datatypesTask.things.WaterBottle;

public class WaterBottleRunner {
	
	public static void main(String[] args) {
		
		Gunashree gunashree=new Gunashree();
		gunashree.water();
		
		Shwetha shwetha=new Shwetha();
		WaterBottle waterBottle=new WaterBottle();
		shwetha.drink(waterBottle);
		
		Devu devu=new Devu();
		WaterBottle waterBottle1=new WaterBottle();
		devu.waterBottle=waterBottle1;
		devu.liquid();
		
	}

}
