<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp"%>

	<h3>도서 페이지</h3>
	<form action="bookcontroller.jsp" method="post">
		제목 : <input type="text" name="title" placeholder="Enter title"> <input type="submit" value="검색">
	</form>
	
	<h3> 검색 결과 </h3>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
		</tr>
		<%
			for( int i = 0 ; i<booklist.length; i++ ){ %>
				<tr>
					<td> <%=(i+1) %> </td>
					<td> 
						<a href="boardview.jsp?bnum=<%=i%>"> 
						<%= %>
						</a> 
					</td>
					<%-- <td> <%=books.get(i).getContents() %> </td> --%>
				</tr>
				
		<%	} %>
		
	</table>


	<h3>전체 도서 목록</h3>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
		</tr>
		<tr>
			<td><%=1%></td>
			<td><%=booklist[0]%></td>
		</tr>
		<tr>
			<td><%=2%></td>
			<td><%=booklist[1]%></td>
		</tr>
		<tr>
			<td><%=3%></td>
			<td><%=booklist[2]%></td>
		</tr>
		<tr>
			<td><%=4%></td>
			<td><%=booklist[3]%></td>
		</tr>


	</table>

</body>
</html>