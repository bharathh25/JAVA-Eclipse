package com.xworkz.datatypesTask;

import com.xworkz.datatypesTask.things.Divya;
import com.xworkz.datatypesTask.things.Harshitha;
import com.xworkz.datatypesTask.things.Omkar;
import com.xworkz.datatypesTask.things.Shoe;

public class ShoeRunner {
	
	public static void main(String[] args) {
		
		Divya divya = new Divya();
		divya.wear();//LV
		
		Omkar omkar = new Omkar();
		Shoe shoe = new Shoe();
		omkar.sole(shoe);//para
		
		Harshitha harshitha = new Harshitha();
		Shoe shoe1=new Shoe();
		harshitha.shoe=shoe1;
		harshitha.walk();//IV
	}

}
