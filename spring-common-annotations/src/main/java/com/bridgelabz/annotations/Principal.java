package com.bridgelabz.annotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {

	public void principalInfo() {
		System.out.println("Hi Student, I'am your new Principal");
		System.out.println("My Name is Michale Jackson");
	}

}
