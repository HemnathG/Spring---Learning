package com.bridgelabz.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration Loaded");
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}

}
