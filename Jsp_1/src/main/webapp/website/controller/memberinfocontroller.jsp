<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../view/header.jsp"%>
	
<%
String id = MemberDao.getmemberDao().memberinfo(loginid).getM_id();
String password = MemberDao.getmemberDao().memberinfo(loginid).getM_password();

%>
</body>
</html>