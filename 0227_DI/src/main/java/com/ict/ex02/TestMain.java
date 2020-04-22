package com.ict.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// DI는 Spring Container에서 객체(Bean)를 생성하고 관리
		// Spring Container는 Configuration Metadata에서 제공하는 정보를 참조
		// Configuration Metadata는 현재 Configuration.xml에 정의되어 있음
		// Spring Container = BeanFactory = ApplicationContext
		
		ApplicationContext context = 
				//new GenericXmlApplicationContext("configuration Meta 정보 위치);
				new GenericXmlApplicationContext("com/ict/ex02/Configuration.xml");
		
		// 사용할 클래스 호출
		Service service = (Service)context.getBean("service");
		//Service service = context.getBean("service",Service.class);
		// 해당 메소드 실행
		service.biz();
	}
}
