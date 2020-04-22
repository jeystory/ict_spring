<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과보기</h1>
	<h2>
		<li>올린 사람 : ${u_name}</li>
		<li>파일이름 : ${file_name}</li>
		<li>파일타입 : ${file_type }</li>
		<li>파일크기 : ${size}KB</li>
		<li>파일이름 2 : ${name2}</li>
		<li>수정날짜:${lastday }</li>
		<li> 다운로드  : <a href="down2.do?file_name=${file_name}">${file_name}</a></li>
		<li><img src="resources/images/${file_name}"></li>
		
	</h2>
</body>
</html>