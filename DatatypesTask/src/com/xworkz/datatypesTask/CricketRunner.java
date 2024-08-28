package com.xworkz.datatypesTask;

import com.xworkz.datatypesTask.things.Cricket;
import com.xworkz.datatypesTask.things.Dhawan;
import com.xworkz.datatypesTask.things.Rohit;
import com.xworkz.datatypesTask.things.Virat;

public class CricketRunner {

	public static void main(String[] args) {
		
		Rohit rohit = new Rohit();
		rohit.hitman();
		
		Dhawan dhawan = new Dhawan();
		Cricket cricket=new Cricket();
		dhawan.gabbar(cricket);
		
		Virat virat = new Virat();
		Cricket cricket1= new Cricket();
		virat.cricket=cricket1;
		virat.king();

	}

}
