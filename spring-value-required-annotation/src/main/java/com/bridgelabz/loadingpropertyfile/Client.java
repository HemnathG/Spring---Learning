package com.bridgelabz.loadingpropertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file.xml");
		System.out.println("The XML File has been loaded");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		student.displayStudentInfo();
	}
}  
