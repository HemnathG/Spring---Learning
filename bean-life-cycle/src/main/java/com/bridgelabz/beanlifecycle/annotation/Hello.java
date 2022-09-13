package com.bridgelabz.beanlifecycle.annotation;

public class Hello {
	
	public void init() {
		System.out.println("Inside Hello Class Init Method ");
	}
	
	public void destroy() {
		System.out.println("Inside Hello Class Destroy Method ");
	}
}
