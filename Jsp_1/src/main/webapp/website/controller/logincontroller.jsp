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
	String m_id = request.getParameter("id");
	String m_password = request.getParameter("password");

	boolean result = MemberDao.getmemberDao().login(m_id, m_password);
	if (result) {

	    // 1. 세션 할당
	    session.setAttribute("loginid", m_id);
	    response.sendRedirect("../view/main.jsp");
	    
	} else {
	    response.sendRedirect("../view/member/login.jsp?result=fail");
	}
	%>


</body>
</html>