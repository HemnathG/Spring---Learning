package com.bridgelabz.lc;

public class Student {

	private Cheat cheat;

	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}


	public void cheating() {
		System.out.println("Cheating done by Student Class");
		cheat.cheat();
	}
}
