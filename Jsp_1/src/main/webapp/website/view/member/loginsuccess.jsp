<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../header.jsp" %>
	<%
	String name = (String)session.getAttribute("loginid");
	%>
	<h3><%out.println(name + "님 안녕하세요.");%></h3>
	
	

</body>
</html>