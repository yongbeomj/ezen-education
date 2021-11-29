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

	<br>
	<br>
	<br>
	<br>
	<br>

	<div class="container text-center py-5">
		<h3>회원가입</h3>
	</div>

	<div class="container">
		<div class="col-md-8 offset-3">
			<div class="row">
				<div class="col-md-4">
					<p class="text">아이디</p>
				</div>
				<div class="col-md-6">
					<input type="text" class="form-control" placeholder="아이디">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">비밀번호</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="비밀번호">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">비밀번호 확인</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="비밀번호 확인">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">이름</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="이름">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">연락처</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="연락처">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">이메일</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="이메일">
				</div>
			</div>

			<div class="row">
				<div class="col-md-4 offset-2 my-5">
					<button class="btn btn btn-outline-info" type="submit">취소</button>
				</div>
				<div class="col-md-6 my-5">
					<button class="btn btn btn-outline-info" type="submit">회원가입</button>
				</div>
			</div>

		</div>
	</div>
	
	<%@include file="footer.jsp"%>
</body>
</html>