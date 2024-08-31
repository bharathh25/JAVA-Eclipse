package com.xworkz.superchaining.chain;

public class SuperMarket extends Market {

	public SuperMarket(String location, int shops) {
		super(location,shops);
		System.out.println("SuperMarket constructer with location & shops parameters");
	}

	public SuperMarket(int shops, String type) {
		super(shops,type);
		System.out.println("SuperMarket constructer with type & shops parameters");

	}

	public SuperMarket(String name, String location) {
		super(name,location);
		System.out.println("SuperMarket constructer with location & shops name");

	}

	public SuperMarket() {
		super("K R Market","Bengaluru",365,"All in one");
		System.out.println("SuperMarket constructer with all 4 parameters");

	}

}
