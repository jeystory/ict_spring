<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구매자 주문 정보</title>

</head>
<body>

	<c:choose>
		<c:when test="${login=='ok'}">
		</c:when>
		<c:otherwise>
			<a href="login.do">로그인</a>
		</c:otherwise>
	</c:choose>
	<hr>

	<table id="order_list">
		<thead>
			<tr>
				<th>구매번호</th>
				<th>주문일</th>
				<th>총구매액</th>
				<th>진행상태</th>

			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${empty order_list}">
					<tr>
						<h3>구매 목록이 없습니다.</h3>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="k" items="${order_list}">
						<tr align="center">
							<td><a
								href="order_detail.do?cust_id=${k.cust_id}&order_id=${k.order_id}&cPage=${paging.nowPage}">${k.order_id}</a></td>
							<td>${k.order_date.substring(0,10)}</td>	<!-- 구매날짜 -->
							<td><fmt:formatNumber value="${k.total_price}" pattern="#,##0" />원</td> <!-- 총구매액 -->
							<td>
								<c:choose>
									<c:when test="${k.order_status=='1'}">결제완료</c:when>
									<c:when test="${k.order_status=='2'}">상품준비중</c:when>
									<c:when test="${k.order_status=='3'}">배송중</c:when>
									<c:when test="${k.order_status=='4'}">배송완료</c:when>
									<c:when test="${k.order_status=='5'}">구매완료</c:when>	
									<c:otherwise>반품</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>


		</tbody>
		<tfoot>
			<tr>
					<td colspan="5">
					<!-- 이전 -->
					<c:choose>
						<c:when test="${paging.beginBlock > paging.pagePerBlock }">
							<a href="order_list.do?cust_id=${mvo.id}&cPage=${paging.beginBlock-paging.pagePerBlock}"> 
								<span style="background:#B2CCFF "><font size="4" >이전으로</font></span>&nbsp;&nbsp;&nbsp;&nbsp;	 
							</a>
						</c:when>
						<c:otherwise>
							<font size="4" style="color: gray;"><b>이전으로</b></font>&nbsp;&nbsp;&nbsp;&nbsp;
						</c:otherwise>
					</c:choose>
					<!-- 페이지번호 -->
					<c:forEach begin="${paging.beginBlock}" end="${paging.endBlock}" step="1" var="k">
						<c:choose>
							<c:when test="${k==paging.nowPage }">
								<font size="4">${k}</font>&nbsp;&nbsp;
							</c:when>
							<c:otherwise>
								<span style="background:#B2CCFF "><a href="order_list.do?cust_id=${mvo.id}&cPage=${k}"><font size="4">${k}</a></font></span>&nbsp;&nbsp;
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<!-- 다음 -->
					<c:choose>
						<c:when test="${paging.endBlock < paging.totalPage }">
							<a href="order_list.do?cust_id=${mvo.id}&cPage=${paging.beginBlock+paging.pagePerBlock}">
								<span style="background:#B2CCFF ">
									<font size="4" >다음으로</font>
								</span>&nbsp;&nbsp;&nbsp;&nbsp;
							</a>
						</c:when>
						<c:otherwise>
							<font size="4" style="color: gray;"><b>다음으로</b></font>&nbsp;&nbsp;&nbsp;&nbsp;
						</c:otherwise>
					</c:choose>
				</td>
				</tr>
		
		</tfoot>

	</table>

</body>
</html>