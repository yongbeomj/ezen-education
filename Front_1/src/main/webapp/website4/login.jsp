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
		<h3>로그인</h3>
	</div>

	<div class="container">

		<div class="col-md-4 offset-4 input-group my-3">
			<input type="text" class="form-control" placeholder="아이디">
		</div>
		<div class="col-md-4 offset-4 input-group my-3">
			<input type="text" class="form-control" placeholder="비밀번호">
		</div>

		<div class="col-md-4 offset-4">
			<button class="btn btn btn-outline-info">로그인</button>
		</div>

		<div class="col-md-4 offset-4 text-center">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
					<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
						<li class="nav-item"><a class="nav-link" href="#">아이디찾기</a></li>
						<li class="nav-item"><a class="nav-link" href="#">비밀번호찾기</a></li>
						<li class="nav-item"><a class="nav-link" href="#">회원가입</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
	
</body>
</html>