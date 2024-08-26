package com.xworkz.practice;

import com.xworkz.practice.data.SideDishData;
import com.xworkz.practice.store.SideDishDataStore;

public class SideDishRunner {
	
	public static void main(String[] args) {
		SideDishDataStore dish=new SideDishDataStore();
		dish.show();
		SideDishData data1=new SideDishData("RasMalai", 70, "Sweet");
		data1.display();
		SideDishData data2=new SideDishData("Paneer Chilly", 130, "Spicy");
		data2.display();
		SideDishData data3=new SideDishData("Mushroom Dry", 125, "Spicy");
		data3.display();
		SideDishData data4=new SideDishData("IceCream", 40, "Sweet");
		data4.display();
		SideDishData data5=new SideDishData("Gulab Jamun", 65, "Sweet");
		data5.display();
	}

}