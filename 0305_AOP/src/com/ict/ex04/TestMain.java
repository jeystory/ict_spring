package com.ict.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/ex04/aop.xml");
		
		// java.lang.ClassCastException 
		// Boy boy = (Boy)context.getBean("boy");
		//boy.doSometing();
		
		Person person = (Person)context.getBean("boy");
		person.doSometing();
		
		 System.out.println("===================");
		 Person person2 = (Person)context.getBean("girl");
		person2.doSometing();
	}
}
