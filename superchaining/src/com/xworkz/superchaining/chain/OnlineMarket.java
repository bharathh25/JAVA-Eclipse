package com.xworkz.superchaining.chain;

public class OnlineMarket extends Market {
	
	public OnlineMarket(String location, int shops) {
		super(location,shops);
		System.out.println("OnlineMarket constructer with location & shops parameters");
	}

	public OnlineMarket(int shops, String type) {
		super(shops,type);
		System.out.println("OnlineMarket constructer with type & shops parameters");

	}

	public OnlineMarket(String name, String location) {
		super(name,location);
		System.out.println("OnlineMarket constructer with location & shops name");

	}

	public OnlineMarket() {
		super("Amazon","USA",459234,"All in one - Online");
		System.out.println("OnlineMarket constructer with all 4 parameters");

	}

}
