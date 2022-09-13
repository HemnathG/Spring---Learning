package com.bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file.xml");
		System.out.println("Configuration Loaded");
		Student stud = context.getBean("student", Student.class);
		stud.displayStudentInfo();
		Student stud1 = context.getBean("student1", Student.class);
		stud1.displayStudentInfo();
	}
}
