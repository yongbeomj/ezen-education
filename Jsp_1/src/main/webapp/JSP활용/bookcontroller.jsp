<%@page import="Test.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		//1. 입력받은 변수 요청
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		Book book = new Book(title);
		String str = "";
		if (title != null) {
		    str = book.getTitle();
		}
		
		response.sendRedirect("book.jsp");
	%>
</body>
</html>