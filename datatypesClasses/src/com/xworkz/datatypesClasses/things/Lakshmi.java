package com.xworkz.datatypesClasses.things;

public class Lakshmi {

	public void cloth(WashingMachine washingMachine) {

		if(washingMachine!=null) {
			washingMachine.rinse();
			washingMachine.show();
		}

		else {
			System.out.println("WashingMachine is null");
		}
	}

}
