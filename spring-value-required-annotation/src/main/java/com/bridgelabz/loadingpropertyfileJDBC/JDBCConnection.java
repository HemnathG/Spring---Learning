package com.bridgelabz.loadingpropertyfileJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {

	@Value("${mysql.url}")
	private String url;

	@Value("${mysql.username}")
	private String username;

	@Value("${mysql.password}")
	private String password;

	@Value("${mysql.driver}")
	private String driver;

	public void display() {

		System.out.println("The Username is : " + username);
		System.out.println("The Password is : " + password);
		System.out.println("The Url is : " + url);
		System.out.println("The Driver is : " + driver);
	}

	public void getConnected() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection got Sucessfully : " + con);

	}

}
