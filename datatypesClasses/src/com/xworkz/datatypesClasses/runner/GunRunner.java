package com.xworkz.datatypesClasses.runner;

import com.xworkz.datatypesClasses.things.Dboss;
import com.xworkz.datatypesClasses.things.Godse;
import com.xworkz.datatypesClasses.things.Gun;
import com.xworkz.datatypesClasses.things.Police;
import com.xworkz.datatypesClasses.things.Soldier;

public class GunRunner {

	public static void main(String[] args) {

		Soldier soldier = new Soldier();
		soldier.army();

		Police police=new Police();
		Gun gun = new Gun("Glock 17","Austria","Semi-Automatic Pistol");
		police.duty(gun);

		Dboss dboss=new Dboss();
		Gun gun1=new Gun("Remington 870","United States","Pump-Action Shotgun");
		dboss.gun=gun1;
		dboss.crime();

		Godse godse=new Godse();
		godse.gandhi();
	}

}
