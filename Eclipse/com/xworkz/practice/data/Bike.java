package com.xworkz.practice.data;

public class Bike {
		String[] bike=new String[7];
		int count;
		
		public void store(String name) {
			bike[count++]=name;
		}
		
		public void show()
		{
			for(String bikeName: bike) {
				System.out.println(bikeName);
			}
		}
}
