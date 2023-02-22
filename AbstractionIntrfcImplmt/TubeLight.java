package com.xworkz.abstractionapp.tester;

import com.xworkz.abstractionapp.Switch;

public class TubeLight implements Switch {

	@Override
	public boolean onOrOff() {
    System.out.println("the lighth is on");
	return false;		
	
	}
	
	
	
	
}
