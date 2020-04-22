package com.ict.ex03;

public class MyProcess {
	private String name = "hong";
	private int age = 13;
	
	public MyProcess() {
		// TODO Auto-generated constructor stub
	}

	public MyProcess(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void prn() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}

	
}
