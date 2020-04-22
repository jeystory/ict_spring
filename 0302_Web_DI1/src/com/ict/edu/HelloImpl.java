package com.ict.edu;

public class HelloImpl implements Hello {

	public HelloImpl() {
		System.out.println("HelloIMpl constructor");
	}
	
	@Override
	public String sayHello() {
		return "Hello Spring World";
	}
	
	
}
