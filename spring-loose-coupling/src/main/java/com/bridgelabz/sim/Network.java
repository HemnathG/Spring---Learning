package com.bridgelabz.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Network {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("sim.xml");
		System.out.println("Application Loaded");
		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.activateService();
	}
}
