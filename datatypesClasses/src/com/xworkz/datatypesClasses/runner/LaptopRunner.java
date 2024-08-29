package com.xworkz.datatypesClasses.runner;

import com.xworkz.datatypesClasses.things.Developer;
import com.xworkz.datatypesClasses.things.Laptop;
import com.xworkz.datatypesClasses.things.Manufacturer;
import com.xworkz.datatypesClasses.things.Seller;
import com.xworkz.datatypesClasses.things.Student;

public class LaptopRunner {

	public static void main(String[] args) {

		Manufacturer manufacturer = new Manufacturer();
		manufacturer.make();

		Seller seller = new Seller();
		Laptop laptop = new Laptop("Acer",40000,512);
		seller.sell(laptop);

		Student student = new Student();
		Laptop laptop1 = new Laptop("Apple",120000,1024);
		student.laptop=laptop1;
		student.study();

		Developer developer = new Developer();
		developer.coding();
	}

}
