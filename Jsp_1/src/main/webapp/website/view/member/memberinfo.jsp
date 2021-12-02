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
	String id = MemberDao.getmemberDao().memberinfo(loginid).getM_id();
	String password = MemberDao.getmemberDao().memberinfo(loginid).getM_password();
	String name = MemberDao.getmemberDao().memberinfo(loginid).getM_name();
	String birth = MemberDao.getmemberDao().memberinfo(loginid).getM_brith();
	String sex = MemberDao.getmemberDao().memberinfo(loginid).getM_sex();
	String phone = MemberDao.getmemberDao().memberinfo(loginid).getM_phone();
	String address = MemberDao.getmemberDao().memberinfo(loginid).getM_address();
	String point = MemberDao.getmemberDao().memberinfo(loginid).getM_phone();
	String sdate = MemberDao.getmemberDao().memberinfo(loginid).getM_sdate();
	%>

	<div class="container">
		<div class="text-center">
			<h3 style="border-bottom: solid 1px #eeeee;">
				<%
				out.println(loginid + "님 회원정보");
				%>
			</h3>
			<br>
		</div>
		<div class="row">
			<div class = "col-md-3 m-2">
				<ul>
					<li>아이디</li>
					<li>비밀번호</li>
					<li>이름</li>
					<li>생년월일</li>
					<li>성별</li>
					<li>연락처</li>
					<li>주소</li>
					<li>포인트</li>
					<li>가입일</li>
				</ul>
			</div>
			<div class = "col-md-8">
				<ul>
					<li><% out.print(id); %></li>
					<li><% out.print(password);%></li>
					<li><% out.print(name); %></li>
					<li><% out.print(birth); %></li>
					<li><% out.print(sex); %></li>
					<li><% out.print(phone); %></li>
					<li><% out.print(address); %></li>
					<li><% out.print(point); %></li>
					<li><% out.print(sdate); %></li>
				</ul>
			</div>
		</div>
	</div>

</body>
</html>