<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<!-- 부트스트랩css 설정 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<!-- 본인 css 호출 -->
	<link rel="stylesheet" href="/Jsp_1/website/css/main.css">
	
</head>
<body>

	<!-- 부스트랩 js 설정 -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<!-- 본인 js 호출 -->
	<script src="/Jsp_1/website/js/main.js"></script>
	<!-- 다음 주소 api js 호출 -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	<h3> 헤더 </h3>
	
	<div> <a href="/Jsp_1/website/view/main.jsp"> 로고 </a>  </div>
	
	<%
	String loginid = (String)session.getAttribute("loginid");
	%>
	<ul>
	<%if (session.getAttribute("loginid") != null) {
	    if(loginid.equals("admin")){
	%>	
		<li> <a href="/Jsp_1/website/view/admin/adminmain.jsp"> 관리자 </a></li>
		<%} %>
		
		<li> <a href="/Jsp_1/website/view/member/memberinfo.jsp"> <% out.println(loginid); %> </a> </li>
		<li> <a href="/Jsp_1/website/controller/logoutcontroller.jsp"> 로그아웃 </a>  </li>
	
	
	<% } else { %>
		<li> <a href="/Jsp_1/website/view/member/signup.jsp"> 회원가입 </a> </li>
		<li> <a href="/Jsp_1/website/view/member/login.jsp"> 로그인 </a>  </li>
	<%} %>
	</ul>	
	
</body>
</html>








