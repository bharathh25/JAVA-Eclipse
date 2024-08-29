package com.xworkz.datatypesClasses.things;

public class Police {
	
	public void duty(Gun gun) {

		if(gun!=null) {
			gun.fire();
			gun.display();
		}

		else {

			System.out.println("Gun is null");
		}
	}

}
