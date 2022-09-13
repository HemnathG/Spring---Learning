package com.bridgelabz.ioc;

public class Jio implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling via Jio Sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing via Jio Sim");
	}

}
