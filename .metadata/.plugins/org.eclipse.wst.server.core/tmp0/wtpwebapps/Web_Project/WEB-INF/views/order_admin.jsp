<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 주문관리</title>

<script type="text/javascript" src="resources/js/jquery-3.4.1.min.js"></script> 

<style type="text/css">
	*{
	margin : 0;
	padding : 0;
}
	select{ width : 200px;}
	
</style>
<body>
	
		<table id="board_notice">
			<thead>
				<tr><th>구매번호</th><th>주문일</th><th>상태</th><th>총구매액</th><th>주문 상태 수정</th></tr>
			</thead>
			
			<tbody>
				<c:choose>
					<c:when test="${empty order_list}">
						<tr>
							<h3>구매 목록이 없습니다.</h3>
						</tr>
					</c:when>
					<c:otherwise>

						<c:forEach var="k" items="${order_list}" varStatus="vs">
							<tr align="center">
								<td><a
									href="order_detail.do?cust_id=${k.cust_id}&order_id=${k.order_id}&cPage=${paging.nowPage}">${k.order_id}</a></td>
								<td>${k.order_date}</td>
								<td><select id="update_status_${vs.count }"
									name="update_status_${vs.count }">
										<c:choose>
											<c:when test="${k.order_status=='1'}">
												<option value="1" selected>결제완료</option>
												<option value="2">상품준비중</option>
												<option value="3">배송중</option>
												<option value="4">배송완료</option>
												<option value="5">구매완료</option>
											</c:when>
											<c:when test="${k.order_status=='2'}">
												<option value="1">결제완료</option>
												<option value="2" selected>상품준비중</option>
												<option value="3">배송중</option>
												<option value="4">배송완료</option>
												<option value="5">구매완료</option>
											</c:when>
											<c:when test="${k.order_status=='3'}">
												<option value="1">결제완료</option>
												<option value="2">상품준비중</option>
												<option value="3" selected>배송중</option>
												<option value="4">배송완료</option>
												<option value="5">구매완료</option>
											</c:when>
											<c:when test="${k.order_status=='4'}">
												<option value="1">결제완료</option>
												<option value="2">상품준비중</option>
												<option value="3">배송중</option>
												<option value="4" selected>배송완료</option>
												<option value="5">구매완료</option>
											</c:when>
											<c:when test="${k.order_status=='5'}">
												<option value="1">결제완료</option>
												<option value="2">상품준비중</option>
												<option value="3">배송중</option>
												<option value="4">배송완료</option>
												<option value="5" selected>구매완료</option>
											</c:when>
											<c:otherwise>반품</c:otherwise>
										</c:choose>

								</select>
								
								<td><fmt:formatNumber value="${k.total_price}" pattern="#,##0" />원</td>
								<script>
								function ab${vs.count}() {
									    	var str = $("#update_status_${vs.count} option:selected").val();
										   location.href='order_status_update.do?order_id=${k.order_id}&order_status='+str;
									}
							</script>
								<td><button onclick="ab${vs.count}()">주문 업데이트</button></td>
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
							<a href="order_list.do?cust_id=admin&cPage=${paging.beginBlock-paging.pagePerBlock}"> 
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
								<span style="background:#B2CCFF "><a href="order_list.do?cust_id=admin&cPage=${k}"><font size="4">${k}</a></font></span>&nbsp;&nbsp;
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<!-- 다음 -->
					<c:choose>
						<c:when test="${paging.endBlock < paging.totalPage }">
							<a href="order_list.do?cust_id=admin&cPage=${paging.beginBlock+paging.pagePerBlock}">
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
				<!-- <td><button onclick="review_write_move()"> 글쓰기</button></td> -->
				</tr>
			</tfoot>
		</table>
	
</body>
</html>