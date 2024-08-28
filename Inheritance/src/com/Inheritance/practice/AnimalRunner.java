package com.Inheritance.practice;

import com.Inheritance.practice.store.Animal;
import com.Inheritance.practice.store.Bull;

public class AnimalRunner {

	public static void main(String[] args) {

		Animal animal=new Animal();
		animal.location="mumbai";
		animal.color="black";
		animal.weight=102.56;
		animal.runSpeed=120;
		animal.hornShape="curved";
		animal.bullLocation();
		animal.bullColor();
		animal.bullWeight();
		animal.bullRunSpeed();
		animal.bullHornShape();
		Bull bull=new Animal();
		bull.location="gujurat";
		bull.color="brown";
		bull.weight=150.56;
		bull.runSpeed=110;
		bull.hornShape="curved";
		bull.bullLocation();
		bull.bullColor();
		bull.bullWeight();
		bull.bullRunSpeed();
		bull.bullHornShape();
	}

}