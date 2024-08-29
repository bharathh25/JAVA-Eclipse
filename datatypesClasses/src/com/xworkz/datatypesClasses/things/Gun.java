package com.xworkz.datatypesClasses.things;

public class Gun {
	
	private String name;
	private String countryMade;
	private String type;
	
	public Gun(){
		System.out.println("Created a Gun Constructor with no parameter");
	}

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
		System.out.println("Created a Gun constructor with all 3 parameters");
	}
	
	public void fire() {
		System.out.println("Running Fire in Gun");
	}
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Country Made :"+countryMade);
		System.out.println("Type :"+type);
		System.out.println("------------------");
	}
}

/*Glock 17

Country of Origin: Austria
Type: Semi-Automatic Pistol
Remington 870

Remington 870
Country of Origin: United States
Type: Pump-Action Shotgun

*/





