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
		<h3>ȸ������</h3>
	</div>

	<div class="container">
		<div class="col-md-8 offset-3">
			<div class="row">
				<div class="col-md-4">
					<p class="text">���̵�</p>
				</div>
				<div class="col-md-6">
					<input type="text" class="form-control" placeholder="���̵�">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">��й�ȣ</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="��й�ȣ">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">��й�ȣ Ȯ��</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="��й�ȣ Ȯ��">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">�̸�</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="�̸�">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">����ó</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="����ó">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 my-3">
					<p class="text">�̸���</p>
				</div>
				<div class="col-md-6 my-3">
					<input type="text" class="form-control" placeholder="�̸���">
				</div>
			</div>

			<div class="row">
				<div class="col-md-4 offset-2 my-5">
					<button class="btn btn btn-outline-info" type="submit">���</button>
				</div>
				<div class="col-md-6 my-5">
					<button class="btn btn btn-outline-info" type="submit">ȸ������</button>
				</div>
			</div>

		</div>
	</div>
	
	<%@include file="footer.jsp"%>
</body>
</html>