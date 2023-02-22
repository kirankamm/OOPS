package com.xworkz.abstractionapp.tester;

import com.xworkz.abstractionapp.Shop;

public class JuiceShop implements Shop {

	@Override
	public long doBussiness() {
		System.out.println("juice shop bussiness");
		return 24655l;
	}

	
	
	}
