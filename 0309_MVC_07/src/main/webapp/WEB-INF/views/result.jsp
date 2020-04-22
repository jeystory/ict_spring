<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 그림 보기 </h2>
	<!-- 화면에 출력되지 않음. 톰캣의 경로 '/'로 변경하면 출력가능  -->
	<img src="/resources/images/자바1.gif"> <br> 
	<img src="resources/images/자바1.gif"> <br>
	<img src="<c:url value='/resources/images/자바1.gif' />"> <br> 
	<img src="<c:url value='resources/images/자바1.gif' />"> <br>
</body>
</html>