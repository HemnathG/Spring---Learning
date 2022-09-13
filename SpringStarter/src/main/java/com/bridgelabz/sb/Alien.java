package com.bridgelabz.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int aid;
	private String aname;
	private String tech;
	
	//@Autowired will search by type and @Qualifier will search by name.
	@Autowired
	private Laptop laptop;
	
	
	public Alien() {
		System.out.println("Object Created for Alien Class...!!!");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("Am in Alien Class ... Show Method!!!");
		laptop.compile();
	}
	
		
	

}
