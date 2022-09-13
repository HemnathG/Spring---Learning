package com.bridgelabz.loadingpropertyfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	@Value("${student.interestedCourse}")
	private String interestedCourse;

	@Value("${student.hobby}")
	private String hobby;

	public void displayStudentInfo() {
		System.out.println("Name of the Student is: " + name);
		System.out.println("Interseted Course of " + name + " is: " + interestedCourse);
		System.out.println(name + "'s Hobby is : " + hobby);
	}

}
