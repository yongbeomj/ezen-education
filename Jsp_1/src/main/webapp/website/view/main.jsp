<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹사이트</title>
</head>
<body>
	<%@include file="header.jsp"%>

	<h3>메인부문</h3>
	<%
	MemberDao.getmemberDao();
	%>

	<%@include file="footer.jsp"%>

</body>
</html>
















