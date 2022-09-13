package com.bridgelabz.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;

	public Human() { 
		
	}

	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method for Heart is Called!!!...");
	}
	
	
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Constructor method for Heart is Called!!!...");
	}

	public void startPumping() {

		if (heart != null) {
			heart.pump();
			System.out.println("Name of the Animal is : " +heart.getNameOfAnimal());
			System.out.println("Number of Heart Present is : " +heart.getNoOfHeart());
		} else {
			System.out.println("You are DEAD..!!!.");
		}
	}

}
