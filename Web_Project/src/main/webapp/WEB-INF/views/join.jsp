<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/JavaScript" src="http://code.jquery.com/jquery-1.7.min.js"></script>
<script type="text/JavaScript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
	function openDaumZipAddress() {
			new daum.Postcode({
				oncomplete:function(data) {
					jQuery("#zonecode").val(data.zonecode);
					jQuery("#address").val(data.address);
					jQuery("#address").focus();
					/* console.log(data); */
				}
			}).open();
	}

	function join_ok(f) {
		if(f.pwd.value== f.pwd_ch.value){
			f.action = "join_ok.do";
			f.submit();
		}else{
			alert("두개의 비밀번호가 다릅니다.다시 입력해주세요.");
			f.pwd.value="";
			f.pwd_ch.value="";
			f.pwd.focus();
			return;
		}
	}
</script>
<style type="text/css">

	table{
		margin: 10px auto;
		width: 300px;
		border-collapse: collapse;
		font-size: 15pt;
	}
	table, th, td{
		border: 2px solid lightgray;
		text-align: center;
	}
	
</style>

</head>
<body>
	 <%@ include file="menu_main.jsp"%>
	<div>
		<form method="post">
			<fieldset>
				<legend>Join member</legend>
				<table>
					<tbody>
						
						<tr>
							<th>아이디 </th>
							<td colspan = "2"><input type="text", name="id" size=50></td>
						</tr>
						<tr>
							<th>패스워드 </th>
							<td colspan = "2"><input type="password", name="pwd" size=50></td>
						</tr>
						<tr>
							<th>패스워드 확인 </th>
							<td colspan = "2"><input type="password", name="pwd_ch" size=50></td>
						</tr>
						<tr>
							<th> 이름 </th>
							<td colspan = "2"><input type="text", name="name" size=50></td>
						</tr>
						<tr>
							<th rowspan="2"> 주소 </th>
							<td colspan="2">
								<input id="zonecode" type="text" value="" />
								<input type="button" onClick="openDaumZipAddress();" value = "주소 찾기" />
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="text" id="address" name = "addr" value="" size=50 />
							</td>
						</tr>
						
						
					</tbody>
					<tfoot>
						<tr>
							<td colspan = "3"><input type="button" value="가입" onclick="join_ok(this.form)">
							
							</td>
						</tr>
					</tfoot>
				</table>
			</fieldset>
		</form>
	</div>

</body>
</html>