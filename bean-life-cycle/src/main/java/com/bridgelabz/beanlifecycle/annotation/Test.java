package com.bridgelabz.beanlifecycle.annotation;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file.xml");
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
		System.out.println(studentDAO);
		studentDAO.selectAllRows();
		
		Hello hello = context.getBean("hello", Hello.class);
		context.close();
				
	}

}
