<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	#carouselcontents{margin-bottom : 50px;}
</style>
</head>
<body>
	<div id="carouselcontents" class="carousel slide" data-ride="carousel"
		data-interval="2000">

		<ol class="carousel-indicators">
			<li data-target="#carouselcontents" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontents" data-slide-to="1"></li>
			<li data-target="#carouselcontents" data-slide-to="2"></li>
			<li data-target="#carouselcontents" data-slide-to="3"></li>
		</ol>

		<div class="carousel-item active">
			<img src="img/mainimage1.jpg" alt="" class="img-responsive center-block">
		</div>
		<div class="carousel-item">
			<img src="img/mainimage2.jpg" alt="">
		</div>
		<div class="carousel-item">
			<img src="img/mainimage3.jpg" alt="">
		</div>
		<div class="carousel-item">
			<img src="img/mainimage4.jpg" alt="">
		</div>

		<a class="carousel-control-prev" href="#carouselcontents"
			data-slide="prev"> <span class="carousel-control-prev-icon"></span>
		</a> <a class="carousel-control-next" href="#carouselcontents"
			data-slide="next"> <span class="carousel-control-next-icon"></span>
		</a>
	</div>
</body>
</html>