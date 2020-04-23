<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menu main</title>
<link rel = "stylesheet"  href="resources/css/sw_layout.css">
 <link rel = "stylesheet" href="resources/css/cust_tb.css">
<style type="text/css">

	*{
		margin: 0 0;
	}
	
	
	#main_menu_bar {
  		list-style-type: none;
  		margin: 0;
  		overflow: hidden;
  		background-color : lightcoral;
	}

	#main_menu_bar li {
  		display: inline-block;
	}
 
	li a, .dropbtn {
 		display: inline-block;
  		color: white;
  		text-align: center;
  		padding: 14px 16px; 
  		text-decoration: none;
	}

	#main_menu_bar li a:hover, .dropdown:hover .dropbtn {
  		/* background-color: #ff1a48; */
  		Color : black;
	}

	li.dropdown { display: inline-block;}

	.dropdown-content {
  		display: none;
  		position: absolute;
  		background-color : lightcoral;
  		color : white;
  		min-width: 160px;
  		box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2); 
  		z-index: 1;
	}

	.dropdown-content a {
 	 	color: white;
  		padding: 12px 16px; 
  		text-decoration: none;
  		display: block;
  		text-align: left;
		float : left 
	
	}

	.dropdown:hover .dropdown-content {display: block;}
	
</style>
</head>
<body>

<p>
	<div class="header">
		<img src="resources/images/banner.png" alt="top_banner">
	</div>
	
	<ul id = "main_menu_bar">
		<li><a href="index.do">Home</a></li>
  		<li class = "dropdown"><a href="item.do?item_category=1" class="dropbtn">Menu</a>
  			<div class="dropdown-content" >
      			<a href="item.do?item_category=1">Cookie & Muffin </a>
      			<a href="item.do?item_category=2">Bread</a>
      			<a href="item.do?item_category=3">Dessert</a>
    		</div>
  		</li>
  		
  		<li class = "dropdown"><a href="event.do">Event</a></li>
  		
  		<li class = "dropdown"><a href="review.do">Review</a></li>
  		  		 		
 		 <c:choose>
 		 	<c:when test="${login=='ok'}">
 		 		<c:if test="${mvo.id != 'admin'}">
 		 			<li style="float:right;"><a href="cart_list.do?cust_id=${mvo.id }"> 장바구니 </a></li>
 		 		</c:if>
 				<li style="float:right;"><a href="order_list.do?cust_id=${mvo.id }"> 마이 페이지 </a></li>
 				<li class = "dropdown" style="float:right;"><a href="order_list.do?cust_id=${mvo.id }"> ${mvo.id}님 </a>
 					<div class="dropdown-content">
 						<a href="logout.do">로그아웃</a>
 					</div>
 				</li> 
 		 		
 		 	</c:when>
 		 	<c:otherwise>
 				<li style="float:right;"><a href="login.do"> 장바구니 </a></li>
 				<li style="float:right;"><a href="login.do"> 마이 페이지 </a></li>
 				<li style="float:right;"><a href="login.do"> 로그인</a></li>
 		 	</c:otherwise>
 		 </c:choose>
	</ul>
	
	
  </p>	
</body>
</html>