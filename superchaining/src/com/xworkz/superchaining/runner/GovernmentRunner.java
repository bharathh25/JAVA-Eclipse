package com.xworkz.superchaining.runner;

import com.xworkz.superchaining.chain.CentralGovernment;
import com.xworkz.superchaining.chain.StateGovernment;

public class GovernmentRunner {
	
	public static void main(String[] args) {
		
		StateGovernment stateGovernment = new StateGovernment();
		stateGovernment.display();
		
		StateGovernment stateGovernment1 = new StateGovernment("Delhi","Arvind Kejriwal");
		stateGovernment1.display();
		
		//----
		
		CentralGovernment centralGovernment = new CentralGovernment();
		centralGovernment.display();
		
		CentralGovernment centralGovernment1 = new CentralGovernment("Uttar Pradesh","Yogi");
		centralGovernment1.display();
		
	}

}
