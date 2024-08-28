package com.Inheritance.practice.store;

public class Halwa {
	public String name;
	public double quantity;
	public boolean dryFruits;
	public Halwa() {
		System.out.println("created halwa constructor");

	}
	
	public void sweetness() {
		System.out.println("running sweetness");
		System.out.println("name of halwa:"+name);
		System.out.println("quantity of halwa:"+quantity);
		System.out.println("is dryfruits present in halwa:"+dryFruits);
	}
	
	public void consistency() {
		System.out.println("running consistency");
	}

}


