package com.xworkz.superchaining.runner;

import com.xworkz.superchaining.chain.OnlineMarket;
import com.xworkz.superchaining.chain.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {

		SuperMarket superMarket = new SuperMarket("Malleshwaram",25);
		superMarket.display();

		SuperMarket superMarket1 = new SuperMarket(344,"Vegetable");
		superMarket1.display();

		SuperMarket superMarket2 = new SuperMarket("Chickpete flower market","Chickpete");
		superMarket2.display();

		SuperMarket superMarket3 = new SuperMarket();
		superMarket3.display();

		//----

		OnlineMarket onlineMarket = new OnlineMarket("Delhi",25432);
		onlineMarket.display();

		OnlineMarket onlineMarket1 = new OnlineMarket(434,"Groceries");
		onlineMarket1.display();

		OnlineMarket onlineMarket2 = new OnlineMarket("Bengaluru",43534);
		onlineMarket2.display();

		OnlineMarket onlineMarket3 = new OnlineMarket();
		onlineMarket3.display();

	}

}
