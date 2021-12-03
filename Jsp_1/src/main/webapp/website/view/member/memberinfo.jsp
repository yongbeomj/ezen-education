<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp"%>
	<%
	Member member = MemberDao.getmemberDao().memberinfo(loginid);
	%>

	<div class="container">

		<div class="row">
			<div class="col-md-3">
				<!-- 사이드바 -->
				<div class="nav flex-column nav-pills">
					<!-- flex-column : 세로 메뉴 	// nav-pills : 액티브[클릭] 색상  -->
					<a class="nav-link active" data-toggle="pill" href="#pills-order"> 주문 목록 </a> <a class="nav-link" data-toggle="pill" href="#pills-memberinfo">회원
						정보 </a> <a class="nav-link" data-toggle="pill" href="#pills-memberwrite"> 내가 쓴글 </a> <a class="nav-link" data-toggle="pill"
						href="#pills-memberupdate"
					> 회원 수정 </a> <a class="nav-link" data-toggle="pill" href="#pills-memberdelete"> 회원 탈퇴 </a>
				</div>
			</div>

			<div class="col-md-9">
				<!-- 내용 -->
				<div class="tab-content" id="pills-tabcontent">

					<div class="tab-pane fade show active" id="pills-order">
						<!-- fade : 숨김  show : 열기   -->
						<h3>주문 목록</h3>
						<div class="container">123</div>
					</div>

					<div class="tab-pane fade" id="pills-memberinfo">
						<h3>회원 정보</h3>
						<div class="container">
							<table class="table" id = "member">
								<thead>
									<tr>
										<th colspan="3">회원 개인 정보</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>아이디</td>
										<td colspan="2"><%=member.getM_id()%></td>
									</tr>
									<tr>
										<td>비밀번호</td>
										<td id="tdpassword"><%=member.getM_password()%></td>
										<td><button onclick="passwordchange()" class="form-control">수정</button></td>
									</tr>
									<tr>
										<td>포인트</td>
										<td colspan="2"><%=member.getM_point()%></td>
									</tr>
									<tr>
										<td>회원명</td>
										<td id="tdname"><%=member.getM_name()%></td>
										<td><button id="btnname" onclick="namechange()" class="form-control">수정</button></td>
									</tr>
									<tr>
										<td>생년월일</td>
										<td id="tdbirth"><%=member.getM_brith()%></td>
										<td><button onclick="birthchange()" class="form-control">수정</button></td>
									</tr>
									<tr>
										<td>성별</td>
										<td id="tdsex"><%=member.getM_sex()%></td>
										<td><button onclick="sexchange()" class="form-control">수정</button></td>
									</tr>
									<tr>
										<td>연락처</td>
										<td id="tdphone"><%=member.getM_phone()%></td>
										<td><button onclick="phonechange()" class="form-control">수정</button></td>
									</tr>
									<tr>
										<td>주소</td>
										<td id="tdaddress"><%=member.getM_address()%></td>
										<td><button onclick="addresschange()" class="form-control">수정</button></td>
									</tr>
									<tr>
										<td>가입일</td>
										<td><%=member.getM_sdate()%></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>

					<div class="tab-pane fade" id="pills-memberwrite">
						<h3>내가 쓴글</h3>
						<div class="container">123</div>
					</div>

					<div class="tab-pane fade" id="pills-memberupdate">
						<h3>회원 수정</h3>
						<div class="container">123</div>
					</div>


					<div class="tab-pane fade" id="pills-memberdelete">
						<div class="container">
							<div class="col-md-6 offset-3">
								<h3 id="deleteresult">회원탈퇴 하시겠습니까?</h3>
								<form id="deleteform">
									<br>
									<input type="password" id="password" name="password" class="form-control" placeholder="패스워드">
									<br>
									<input type="button" id="delete" value="탈퇴" class="form-control">
								</form>
							</div>
						</div>
					</div>



				</div>

			</div>
		</div>
	</div>

</body>
</html>