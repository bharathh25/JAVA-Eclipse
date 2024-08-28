package com.xworkz.datatypesTask.things;

public class Virat {
	
	public Cricket cricket;
	
	public void king() {
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


