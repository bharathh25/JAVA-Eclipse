package com.xworkz.datatypesClasses.things;

public class Abhishek {
	
	public WashingMachine washingMachine;

	public void water() {
		if(washingMachine!=null) {
			washingMachine.rinse();
			washingMachine.show();

		}
		else {
			System.out.println("WashingMachine is null");
		}
	}

}
