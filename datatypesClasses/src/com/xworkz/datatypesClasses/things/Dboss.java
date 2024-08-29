package com.xworkz.datatypesClasses.things;

public class Dboss {
	
	public Gun gun;
	
	public void crime() {

		if(gun!=null) {
			gun.fire();
			gun.display();
		}
		else {
			System.out.println("Gun is null");
		}
	}

}
