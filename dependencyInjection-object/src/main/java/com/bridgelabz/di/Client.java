package com.bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file.xml");
		System.out.println("The XML File has been loaded");
		Student student = context.getBean("student", Student.class);
		student.cheating();
		StudentFriend student1 = context.getBean("studentFriend", StudentFriend.class);
		student1.cheatingStarted();
		StudentFriend1 friend1 = context.getBean("studentFriend1", StudentFriend1.class);
		friend1.cheatingStart();
	}
}  
