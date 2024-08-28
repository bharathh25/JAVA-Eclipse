package com.Inheritance.practice;

import com.Inheritance.practice.store.Halwa;
import com.Inheritance.practice.store.Sweet;

public class SweetRunner {

	public static void main(String[] args) {

		Sweet kheer=new Sweet();
		kheer.name="carrot halwa";
		kheer.quantity=2.5;
		kheer.dryFruits=true;
		kheer.consistency();
		kheer.sweetness();
		Halwa halwa=new Sweet();
		halwa.name="pumpkin halwa";
		halwa.quantity=2.5;
		halwa.dryFruits=true;
		halwa.consistency();
		halwa.sweetness();
		
		
	}

}