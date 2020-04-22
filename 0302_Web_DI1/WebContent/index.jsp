<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="com.ict.edu.HelloImpl"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<%--
		 스트립 트립에서 자바 main 메소드에서 코딩한 내용 그래도 코딩하면서 출력 위치만 Web 브라우저로 변경해서 사용가능하다. 
	<%
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/edu/Configuration.xml");
		HelloImpl hello = (HelloImpl)context.getBean("hello");
		out.println("<h2>" + hello.sayHello() + "</h2>"); 
	%> 
	--%>
	
	<%
	
		// web 전용 클래스를 사용하는 방식 
		// Configuration.xml = application
		// Servlet 3.0 이상에서는  WEB-INF 안에 applicationContext.xml을 지정
		// 위치와 이름이 고정(단, web.xml을 이용할 경우 변경 가능)
		// WEB-INF 안에 존재하는 파일들은 접근 불가능
		// 추가적으로 listener를 만들어야 applicationContext.xml읽기 가능
		// listener는 프로젝트당 하나이고  생성방법 2가지
		// listener 방법 : 1. 자바에서 생성 2. web.xml에서 생성
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		HelloImpl hello = (HelloImpl)context.getBean("hello");
		out.println("<h2>" + hello.sayHello() + "</h2>"); 
	
	%>
</body>
</html>