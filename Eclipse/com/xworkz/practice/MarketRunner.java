package com.xworkz.practice;

import com.xworkz.practice.data.MarketData;
import com.xworkz.practice.store.MarketDataStore;

public class MarketRunner {
	
	public static void main(String args[]) {
		
		MarketDataStore marketStore=new MarketDataStore();
		marketStore.show();
		MarketData data1=new MarketData("K R Market", "Bengaluru");
		data1.print();
		MarketData data2=new MarketData("Chor Bazaar","Bengaluru");
		data2.print();
		MarketData data3=new MarketData("Mysuru Market", "Mysuru");
		data3.print();
		MarketData data4=new MarketData("Sunday Bazaar","Bengaluru");
		data4.print();
		MarketData data5=new MarketData("Fish Market", "Mangaluru");
		data5.print();
	}

}