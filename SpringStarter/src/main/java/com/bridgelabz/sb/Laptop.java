package com.bridgelabz.sb;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int laptopID;
	private String brand;
	
	public int getLaptopID() {
		return laptopID;
	}
	public void setLaptopID(int laptopID) {
		this.laptopID = laptopID;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Laptop [laptopID=" + laptopID + ", brand=" + brand + "]";
	}
	public void compile() {
		System.out.println("Am in Laptop Class... Compile Method!!!");
	}

}
