<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구매자 주문 정보</title>
<link rel = "stylesheet" href="resources/css/cust_tb.css">
<link rel = "stylesheet" href="resources/css/sw_form.css">
<link rel = "stylesheet"  href="resources/css/sw_layout.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.min.js"></script> 

<style type="text/css">
*{margin: 0 0;}
</style>

</head>
<body>
	<div class = "main_menu"><%@ include file="menu_main.jsp"%></div>
	<div class = "side_menu"><%@ include file="menu_side.jsp" %></div>
	<div class = "main_content">
	
		<c:choose>
			<c:when test="${login=='ok'}">
			  	  	 &nbsp;  &nbsp; ${mvo.id}의  구매내역 상세조회
			  	</c:when>
			<c:otherwise>
				<a href="login.do">로그인</a>
			</c:otherwise>
		</c:choose>
		<hr>

		<table >
		<thead>
			<tr>
				<th>구매번호</th>
				<th>구매날짜</th>
				<th>상품명</th>
				<th>가격</th>
				<th>개수</th>
				<th>구매액</th>
				<th colspan = "2">진행상태</th>
				
			</tr>
		</thead>
		<tbody>
			<c:choose>
			
				<c:when test="${empty order_detail}" >
					<tr><h3>구매 목록이 없습니다.</h3></tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="k" items="${order_detail}">
						<tr align="center">
							<td>${k.order_id}</td>
							<td>${one_order.order_date.substring(0,10)}
							<td>${k.item_name}</td>
							<td><fmt:formatNumber value="${k.item_price}" pattern="#,##0" />원 </td>						
							<td>${k.item_quantity}</td>
							<td>
								<c:set var="total" value="${k.item_price * k.item_quantity}" />
								<fmt:formatNumber value="${total}" pattern="#,##0" />원
							</td>
							<c:choose>
								<c:when test="${one_order.order_status=='5'}"><td></c:when>
								<c:otherwise><td colspan ="2"></c:otherwise>
							</c:choose>
							
							
								<c:choose>
									<c:when test="${one_order.order_status=='1'}">결제완료</c:when>
									<c:when test="${one_order.order_status=='2'}">상품준비중</c:when>
									<c:when test="${one_order.order_status=='3'}">배송중</c:when>
									<c:when test="${one_order.order_status=='4'}">배송완료</c:when>
									<c:when test="${one_order.order_status=='5'}">구매완료</c:when>	
									<c:otherwise>반품</c:otherwise>
								</c:choose>
							</td>
							
							
							
							<c:choose>
								<c:when test="${one_order.order_status=='5'}" >
									<c:if test="${k.ch_review == 'no'}">
										<td><button onclick="location.href='review_write.do?cust_id=${one_order.cust_id}&order_id=${one_order.order_id}&item_id=${k.item_id}&item_name=${k.item_name}&order_detail_id=${k.order_detail_id}'">리뷰작성</button></td>
									</c:if>
									<c:if test="${k.ch_review == 'yes'}">
										<td>리뷰완료</td>
									</c:if>
								</c:when>
								
							</c:choose>
						</tr>
						<c:set var="orderTotal" value="${orderTotal = orderTotal+total}" />
					</c:forEach>
				</c:otherwise>
			</c:choose>
			
		</tbody>
		<tfoot>
    		<tr>
    			<td  colspan = "7" align="right"><h2>총 구매액 : 
    				<fmt:formatNumber value="${orderTotal}" pattern="#,##0" />원  &nbsp;  &nbsp;</h2>
    				<button onclick="location.href='order_list.do?cPage=${cPage}&cust_id=${mvo.id}'">목록으로</button>
    			</td>
    			
    		</tr>
  		</tfoot>
		
	</table>
	
	
	
	</div>
	<div class="footer"><%@ include file="bottom.jsp" %></div>
</body>
</html>