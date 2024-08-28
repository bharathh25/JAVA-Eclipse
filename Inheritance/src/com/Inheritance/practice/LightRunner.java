package com.Inheritance.practice;

import com.Inheritance.practice.store.Bulb;
import com.Inheritance.practice.store.Light;

public class LightRunner {

	public static void main(String[] args) {

		Light lamp=new Light();
		lamp.price=120;
		lamp.light();
		Bulb bulb=new Light();
		bulb.price=120;
		bulb.light();
		
	}

}