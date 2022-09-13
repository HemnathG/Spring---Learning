package com.bridgelabz.di;

public class StudentFriend1 {
	private MathCheat cheating;

	public void setCheating(MathCheat cheating) {
		this.cheating = cheating;
	}

	public void cheatingStart() {
		System.out.println("Cheating done by Student Friend 1 Class");
		cheating.mathCheating();
	}
}
