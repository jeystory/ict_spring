package com.ict.ex03;

public class MyProcess3 {
	private String name = "hong";
	private int age = 13;
	
	public MyProcess3() {
		// TODO Auto-generated constructor stub
	}

	public MyProcess3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
