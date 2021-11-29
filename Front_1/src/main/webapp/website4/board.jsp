<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp"%>

	<!-- 게시판 start -->

	<br>
	<br>
	<br>
	<br>
	<br>

	<div class="container my-5">
		<h3>QnA</h3>
		<p>질문 게시판</p>
		<div class="col-md-6 offset-6 input-group my-3">
			<select class="custom-select">
				<option>키워드</option>
				<option>번호</option>
				<option>제목</option>
				<option>작성자</option>
			</select> <input type="text" class="form-control">
			<button class="btn btn btn-outline-info">검색</button>
		</div>
		<div class="col-md-12">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>답변여부</th>
						<th>작성일</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>환불해주세요환불해주세요환불해주세요환불해주세요</td>
						<td>유재석</td>
						<td>답변대기중</td>
						<td>2021-11-26</td>
					</tr>
					<tr>
						<td>2</td>
						<td>환불해주세요</td>
						<td>유재석</td>
						<td>답변대기중</td>
						<td>2021-11-26</td>
					</tr>
					<tr>
						<td>3</td>
						<td>환불해주세요</td>
						<td>유재석</td>
						<td>답변대기중</td>
						<td>2021-11-26</td>
					</tr>
					<tr>
						<td>4</td>
						<td>환불해주세요</td>
						<td>유재석</td>
						<td>답변대기중</td>
						<td>2021-11-26</td>
					</tr>
					<tr>
						<td>5</td>
						<td>환불해주세요</td>
						<td>유재석</td>
						<td>답변대기중</td>
						<td>2021-11-26</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="row">
			<div class="col-md-4 offset-4 my-3">
				<ul class="pagination">
					<li class="page-item"><a class="page-link"> << </a></li>
					<li class="page-item"><a class="page-link"> 1 </a></li>
					<li class="page-item"><a class="page-link"> 2 </a></li>
					<li class="page-item"><a class="page-link"> 3 </a></li>
					<li class="page-item"><a class="page-link"> 4 </a></li>
					<li class="page-item"><a class="page-link"> 5 </a></li>
					<li class="page-item"><a class="page-link"> >> </a></li>
				</ul>
			</div>

			<div class="col-md-1 offset-3 my-3">
				<button class="btn btn btn-outline-info"> 문의하기 </button>
			</div>
		</div>

	</div>

	<!-- 게시판 end -->
	<br> <br> <br> <br> <br>
	<%@include file="footer.jsp"%>
</body>
</html>