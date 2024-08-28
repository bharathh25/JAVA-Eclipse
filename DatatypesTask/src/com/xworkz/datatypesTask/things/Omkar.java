package com.xworkz.datatypesTask.things;

public class Omkar {
	
	public void sole(Shoe shoe) {

		if(shoe!=null){
			System.out.println(shoe.brand);
			System.out.println(shoe.price);
			shoe.safeguard();
			shoe.enhance();
		}
		else{
			System.out.println("Shoe is null");
		}
	}

}
