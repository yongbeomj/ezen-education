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
} /* ul태그 기본값 제거*/
li {
	list-style-type: none;
}

#logo {
	float: left;
	margin: 45px 0 0 60px; /* 시계방향 : 위 오른쪽 아래 왼쪽 */
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
	font-family: "궁서";
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
				<li>김지영님</li>
				<li>|</li>
				<li>로그아웃</li>
				<li>|</li>
				<li>정보수정</li>
			</ul>

			<ul id="main_menu">
				<li>Home</li>
				<li>출석부</li>
				<li>작품갤러리</li>
				<li>게시판</li>
			</ul>
		</div>

	</header>
</body>
</html>