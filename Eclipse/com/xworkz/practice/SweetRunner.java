package com.xworkz.practice;

import com.xworkz.practice.data.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
	  Sweet sweet=new Sweet();
	  sweet.store("Peda");
	  sweet.store("Barfi");
	  sweet.store("Sandesh");
	  sweet.store("Chikki");
	  sweet.store("Kaju katli");
	  sweet.store("Jalebi");
	  sweet.store("Imarti");
	  
	  sweet.display();

	}

}