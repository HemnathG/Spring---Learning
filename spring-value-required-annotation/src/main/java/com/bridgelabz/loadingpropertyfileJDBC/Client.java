package com.bridgelabz.loadingpropertyfileJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("connect.xml");
		System.out.println("The XML File has been loaded");
		JDBCConnection jdbc = context.getBean("jdbc", JDBCConnection.class);
		System.out.println(jdbc);
		jdbc.display();
		jdbc.getConnected();
		context.close();
	}
}  
