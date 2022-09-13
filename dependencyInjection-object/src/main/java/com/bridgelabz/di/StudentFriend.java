package com.bridgelabz.di;

public class StudentFriend {

	private MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void cheatingStarted() {
		System.out.println("Cheating Done by Student Friend Class");
		cheat.mathCheating();
	}
}
