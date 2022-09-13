package com.bridgelabz.annotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi, Iam your Math Teacher!!!");
		System.out.println("My Name is Precilla");

	}

}
