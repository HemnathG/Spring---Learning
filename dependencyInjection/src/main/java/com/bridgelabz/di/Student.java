package com.bridgelabz.di;

public class Student {

	private String studentName;
	private int id;

//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}

	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public void displayStudentInfo() {
		System.out.println("The Student Name is :" + studentName);
		System.out.println("The Student ID is :" + id);
	}

}
