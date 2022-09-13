package com.bridgelabz.ioc;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling via Vodaphone Sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing via Vodaphone Sim");
	}

}
