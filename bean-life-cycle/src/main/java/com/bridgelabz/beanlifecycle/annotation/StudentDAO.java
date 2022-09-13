package com.bridgelabz.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;
	
	//Connection Object
	Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("Setting Driver");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("Setting URL");
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("Setting UserName");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("Setting Password!!!");
		this.password = password;
	}
	
	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("Inside the Custom Init Method");
		createDBConnection();
	}
	
	public void createDBConnection() throws ClassNotFoundException, SQLException {
		System.out.println("Creating Connection");
		// Load Driver
		Class.forName(driver);

		// Get Connection
		con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("Connection Started!!!");

	}

	public void selectAllRows() throws SQLException, ClassNotFoundException {

		System.out.println("Getting the datas from Hostel");

		// Execute Query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from HostelStudentInfo");

		while (rs.next()) {
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			Double hostelFees = rs.getDouble(3);
			String foodType = rs.getString(4);

			System.out.println(studentId + " " + studentName + " " + hostelFees + " " + foodType);
			;
		}

	}

	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {

		// Execute Query
		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from Hostel.HostelStudentInfo where Student_ID = " + studentId);

		System.out.println("Record Deleted with the ID :" + studentId);

	}

	//@PreDestroy
	public void destroy() throws SQLException {
		
		// cleaning it
		System.out.println("Inside Destroy Method");
		closeConnection();
	}
	
	public void closeConnection() throws SQLException {
		
		// closing the connection
		con.close();
		System.out.println("DB Connection Closed");
	}

}
