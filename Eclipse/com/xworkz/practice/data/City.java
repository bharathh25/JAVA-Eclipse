package com.xworkz.practice.data;

public class City {
	
	String[] name=new String[7];
	int count;
	public void store(String cityName) {
		name[count++]=cityName;
	}
	
	public void display() {
		for(String cityname : name) {
			System.out.println(cityname);
		}
	}

}
