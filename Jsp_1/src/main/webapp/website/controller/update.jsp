<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	request.setCharacterEncoding("UTF-8");
	String id = (String)session.getAttribute("loginid");
	String inputname = request.getParameter("inputname");
	
	if (inputname !=null){
	    if (MemberDao.getmemberDao().update("m_name", inputname, id)){
		out.print("1");
	    } else {
		out.print("0");
	    }
	    
	}
	
	
	
	%>
</body>
</html>