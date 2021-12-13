<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	int p_num = Integer.parseInt(request.getParameter("p_num"));
	Product product = ProductDao.getProductDao().getproduct(p_num);
	%>

	<%@ include file="../header.jsp"%>
	<div class="container">
		<table class="table text-center">
			<thead>
				<tr>
					<th colspan="3">제품 정보 수정</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>제품명</td>
					<td id="pname"><%=product.getP_name()%></td>
					<td>
						<button onclick="namechange();" class="form-control">수정</button>
					</td>
				</tr>

				<tr>
					<td>제품가격</td>
					<td id="pprice"><%=product.getP_price()%></td>
					<td>
						<button onclick="namechange();" class="form-control">수정</button>
					</td>
				</tr>

				<tr>
					<td>카테고리</td>
					<td id="pcaterory"><%=product.getP_category()%></td>
					<td>
						<button onclick="namechange();" class="form-control">수정</button>
					</td>
				</tr>
				<tr>
					<td>제조사</td>
					<td id="pmanu"><%=product.getP_manufacturer()%></td>
					<td>
						<button onclick="namechange();" class="form-control">수정</button>
					</td>
				</tr>
				<tr>
					<td>제품상태</td>
					<td><%=product.getP_active()%></td>
				</tr>
				<tr>
					<td>사이즈</td>
					<td id="psize"><%=product.getP_size()%></td>
					<td>
						<button onclick="namechange();" class="form-control">수정</button>
					</td>
				</tr>
				<tr>
					<td>재고</td>
					<td id="pstock"><%=product.getP_stock()%></td>
					<td>
						<button onclick="namechange();" class="form-control">수정</button>
					</td>
				</tr>
				<tr>
					<td>이미지</td>
					<td id="pimage"><%=product.getP_img()%></td>
					<td>
						<button onclick="namechange();" class="form-control">수정</button>
					</td>
				</tr>
				<tr>
					<td>설명</td>
					<td id="pcontents"><%=product.getP_contents()%></td>
					<td>
						<button onclick="namechange();" class="form-control">수정</button>
					</td>
				</tr>
				<tr>
					<td>제품등록일</td>
					<td><%=product.getP_date()%></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>