package com.xworkz.datatypesTask.things;

public class Dhawan {
	
	public void gabbar(Cricket cricket) {
		if(cricket!=null) {
			cricket.batting();
			cricket.bowling();
			cricket.fielding();
			System.out.println(cricket.bat);
			System.out.println(cricket.ball);
		}
		else {
			System.out.println("Cricket is null");
		}
	}

}
