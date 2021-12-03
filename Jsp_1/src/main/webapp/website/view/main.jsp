<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹사이트</title>
</head>
<body>
	<%@include file="header.jsp"%>

	<!-- 캐러셀 start -->
		<div id="carouselcontent" class="carousel slide" data-ride="carousel" data-interval="2000">
		
			<ol class="carousel-indicators">
				<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
				<li data-target="#carouselcontent" data-slide-to="1" ></li>
				<li data-target="#carouselcontent" data-slide-to="2" ></li>
				<li data-target="#carouselcontent" data-slide-to="3" ></li>
				<li data-target="#carouselcontent" data-slide-to="4" ></li>
			</ol>
			<div class="carousel-inner">
				<div class="carousel-item active"> <img src="../img/carousel1.jpg"> </div>
				<div class="carousel-item"> <img src="../img/carousel2.jpg"> </div>
				<div class="carousel-item"> <img src="../img/carousel3.jpg"> </div>
				<div class="carousel-item"> <img src="../img/carousel4.jpg"> </div>
				<div class="carousel-item"> <img src="../img/carousel5.jpg"> </div>
			</div>
			<!-- 케러셀 이미지 이동 버튼 -->
			<a class="carousel-control-prev" href="#carouselcontent" data-slide="prov" >
				<span class="carousel-control-prev-icon"></span>
			</a>
			<a class="carousel-control-next" href="#carouselcontent" data-slide="next" >
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>
	<!-- 캐러셀 end -->
	
	<!-- 제품 목록 -->
	<div class="container">
		<!-- 박스권 -->
		<div class="row mb-2">
			<!-- 가로 12 그리드 -->

			<div class="col-md-4 col-sm-6 my-5">
				<!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card">
					<!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">
					<!-- 카드 상단 이미지 -->
					<div class="card-body">
						<!-- 카드 내용 -->
						<p class="card-text">코트니 모헤어 라운드 니트</p>
						<hr>
						<p class="item p-1">
							프리미엄 퀄리티를 느끼실 수 있는 리얼 모헤어 라운드니트입니다.<br> <br> <span
								class="price mr-2">62,900원 </span> 59,750원 <br> <span
								class="badge badge-pill badge-warning my-2"> 주문폭주 </span> <span
								class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 col-sm-6 my-5">
				<!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card">
					<!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">
					<!-- 카드 상단 이미지 -->
					<div class="card-body">
						<!-- 카드 내용 -->
						<p class="card-text">코트니 모헤어 라운드 니트</p>
						<hr>
						<p class="item p-1">
							프리미엄 퀄리티를 느끼실 수 있는 리얼 모헤어 라운드니트입니다.<br> <br> <span
								class="price mr-2">62,900원 </span> 59,750원 <br> <span
								class="badge badge-pill badge-warning my-2"> 주문폭주 </span> <span
								class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 col-sm-6 my-5">
				<!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card">
					<!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">
					<!-- 카드 상단 이미지 -->
					<div class="card-body">
						<!-- 카드 내용 -->
						<p class="card-text">코트니 모헤어 라운드 니트</p>
						<hr>
						<p class="item p-1">
							프리미엄 퀄리티를 느끼실 수 있는 리얼 모헤어 라운드니트입니다.<br> <br> <span
								class="price mr-2">62,900원 </span> 59,750원 <br> <span
								class="badge badge-pill badge-warning my-2"> 주문폭주 </span> <span
								class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 col-sm-6 my-5">
				<!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card">
					<!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">
					<!-- 카드 상단 이미지 -->
					<div class="card-body">
						<!-- 카드 내용 -->
						<p class="card-text">코트니 모헤어 라운드 니트</p>
						<hr>
						<p class="item p-1">
							프리미엄 퀄리티를 느끼실 수 있는 리얼 모헤어 라운드니트입니다.<br> <br> <span
								class="price mr-2">62,900원 </span> 59,750원 <br> <span
								class="badge badge-pill badge-warning my-2"> 주문폭주 </span> <span
								class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 col-sm-6 my-5">
				<!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card">
					<!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">
					<!-- 카드 상단 이미지 -->
					<div class="card-body">
						<!-- 카드 내용 -->
						<p class="card-text">코트니 모헤어 라운드 니트</p>
						<hr>
						<p class="item p-1">
							프리미엄 퀄리티를 느끼실 수 있는 리얼 모헤어 라운드니트입니다.<br> <br> <span
								class="price mr-2">62,900원 </span> 59,750원 <br> <span
								class="badge badge-pill badge-warning my-2"> 주문폭주 </span> <span
								class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 col-sm-6 my-5">
				<!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card">
					<!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">
					<!-- 카드 상단 이미지 -->
					<div class="card-body">
						<!-- 카드 내용 -->
						<p class="card-text">코트니 모헤어 라운드 니트</p>
						<hr>
						<p class="item p-1">
							프리미엄 퀄리티를 느끼실 수 있는 리얼 모헤어 라운드니트입니다.<br> <br> <span
								class="price mr-2">62,900원 </span> 59,750원 <br> <span
								class="badge badge-pill badge-warning my-2"> 주문폭주 </span> <span
								class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>


		</div>
	</dIV>
	<!-- 제품 목록 end -->

	<%@include file="footer.jsp"%>

</body>
</html>
















