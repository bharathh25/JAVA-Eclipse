package com.xworkz.datatypesClasses.runner;

import com.xworkz.datatypesClasses.things.Abhishek;
import com.xworkz.datatypesClasses.things.Bhumika;
import com.xworkz.datatypesClasses.things.Lakshmi;
import com.xworkz.datatypesClasses.things.Megha;
import com.xworkz.datatypesClasses.things.Nayana;
import com.xworkz.datatypesClasses.things.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		Megha megha=new Megha();
		megha.wash();
		
		Lakshmi lakshmi=new Lakshmi();
		WashingMachine washingMachine=new WashingMachine("LG","Top-Load",5.6);
		lakshmi.cloth(washingMachine);
		
		Abhishek abhishek=new Abhishek();
		WashingMachine washingMachine1=new WashingMachine("BOSCH","Front-Load",8.5);
		abhishek.washingMachine=washingMachine1;
		abhishek.water();
		
		Bhumika bhumika = new Bhumika();
		bhumika.soap();
		
		Nayana nayana = new Nayana();
		nayana.brush();
	}

}
