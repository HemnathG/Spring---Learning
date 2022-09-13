package com.bridgelabz.ioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling via Airtel Sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing via Airtel Sim");
	}

}
