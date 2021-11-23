<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
* {
	
	padding: 0;
	margin: 0;
} /* ul�±� �⺻�� ����*/
li {
	list-style-type: none;
}

#logo {
	float: left;
	margin: 45px 0 0 60px; /* �ð���� : �� ������ �Ʒ� ���� */
}

#menus {
	float: right;
	text-align: right;
	margin-right: 45px;
}

#menus li {
	display: inline;
}
#top_menu {
	margin: 25px 0 35px 0;
}
#top_menu li {
	margin: 30px 0 0 10px;
}

#main_menu li {
	margin: 50px 0 0 80px;
	font-family: "�ü�";
	font-weight: bold;
	font-size: 20px;
}



#main_menu {
	margin-top: 20px;
	font-size: 20px;
	color: black;
}
</style>
</head>
<body>
	<header>
		<div id="logo">
			<img alt="" src="img/logo.png">
		</div>

		<div id="menus">
			<ul id="top_menu">
				<li>��������</li>
				<li>|</li>
				<li>�α׾ƿ�</li>
				<li>|</li>
				<li>��������</li>
			</ul>

			<ul id="main_menu">
				<li>Home</li>
				<li>�⼮��</li>
				<li>��ǰ������</li>
				<li>�Խ���</li>
			</ul>
		</div>

	</header>
</body>
</html>