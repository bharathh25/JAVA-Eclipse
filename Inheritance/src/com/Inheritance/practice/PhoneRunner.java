package com.Inheritance.practice;

import com.Inheritance.practice.store.Phone;
import com.Inheritance.practice.store.SmartPhone;

public class PhoneRunner {

	public static void main(String[] args) {

		Phone touchScreenPhone=new Phone();
		touchScreenPhone.brand="samsung";
		touchScreenPhone.storage=256;
		touchScreenPhone.ai=false;
		touchScreenPhone.price=12000;
		touchScreenPhone.version="s20";
		touchScreenPhone.brandDetails();
		touchScreenPhone.storageDetails();
		SmartPhone smartPhone=new Phone();
		smartPhone.brand="vivo";
		smartPhone.storage=1000;
		smartPhone.ai=true;
		smartPhone.price=72000;
		smartPhone.version="v30";
		smartPhone.brandDetails();
		smartPhone.storageDetails();
		
		
	}

}