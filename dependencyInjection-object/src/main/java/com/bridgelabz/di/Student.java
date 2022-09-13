package com.bridgelabz.di;

public class Student {

	private int id;
	private MathCheat mathCheat;

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void cheating() {
		System.out.println("Cheating done by Student Class");
		mathCheat.mathCheating();
		System.out.println("My Exam Registratiion number is: " +id);
	}
}
