<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Wolshino Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<%@include file="common/inc.html" %>
<script type="application/x-javascript"> 
addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); 
function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<link href='http://fonts.useso.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
<!---- animated-css ---->
<link href="/template/moban334/css/animate.css" rel="stylesheet" type="text/css" media="all">
<script src="/template/moban334/js/wow.min.js"></script>
<script>new WOW().init();</script>
<!---- animated-css ---->	
<link rel="stylesheet" href="/template/moban334/css/flexslider.css" type="text/css" media="screen" />
<link href="/template/moban334/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
<script src="/template/moban334/js/jquery.magnific-popup.js" type="text/javascript"></script>
<script>
	$(document).ready(function() {
		$('.popup-with-zoom-anim').magnificPopup({
			type : 'inline',
			fixedContentPos : false,
			fixedBgPos : true,
			overflowY : 'auto',
			closeBtnInside : true,
			preloader : false,
			midClick : true,
			removalDelay : 300,
			mainClass : 'my-mfp-zoom-in'
		});
	});
</script>
</head>
<body>
<c:import url="common/header.jsp">
	<c:param name="pos" value="0"></c:param>
</c:import>
<div class="wrap">
<div class="banner">
	<div class="container">
		<div class="wmuSlider example1 section" id="section-1">
			<article style="position: absolute; width: 100%; opacity: 0;">
				<div class="banner-info">
					<h1>Veil project</h1>
					<a href="#" class="meet wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">JOIN</a>
				</div>
			</article>
			<article style="position: absolute; width: 100%; opacity: 0;">
				<div class="banner-info">
					<h1>Lorem Ipsum has been</h1>
					<a href="#" class="meet wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">JOIN</a>
				</div>
			</article>
			<article style="position: absolute; width: 100%; opacity: 0;">
				<div class="banner-info">
					<h1>The point of using Lorem</h1>
					<a href="#" class="meet wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">JOIN</a>
				</div>
			</article>
			<ul class="wmuSliderPagination">
				<li><a href="#" class="">0</a></li>
				<li><a href="#" class="">1</a></li>
				<li><a href="#" class="">2</a></li>
			</ul>
		</div>
		<!-- script -->
		<script src="/template/moban334/js/jquery.wmuSlider.js"></script>
		<script>
			$('.example1').wmuSlider();
		</script>
		<!-- script -->
	</div>
</div>
<!-- types -->
	<div class="types">
		<div class="container">
			<h3>6 house types</h3>
			<div class="col-md-3 types-top wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<i class="aspen"></i>
				<h4>aspen</h4>
				<p>House area - 121.4 m2.Not a big compact and cozy house of wood. Gable roof. Second floor - attic. Space of the house clearly defined by function. To .... </p>
			</div>
			<div class="col-md-3 types-top wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<i class="heaven"></i>
				<h4>heaven</h4>
				<p>House area - 121.4 m2.Not a big compact and cozy house of wood. Gable roof. Second floor - attic. Space of the house clearly defined by function. To .... </p>
			</div>
			<div class="col-md-3 types-top wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<i class="Veil"></i>
				<h4>Veil</h4>
				<p>House area - 121.4 m2.Not a big compact and cozy house of wood. Gable roof. Second floor - attic. Space of the house clearly defined by function. To .... </p>
			</div>
			<div class="col-md-3 types-top wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<i class="Tower"></i>
				<h4>Tower</h4>
				<p>House area - 121.4 m2.Not a big compact and cozy house of wood. Gable roof. Second floor - attic. Space of the house clearly defined by function. To .... </p>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- types -->
<!-- about -->
	<div class="abo">
		<div class="container">
			<h2>about</h2>
			<p>New summer resort ... "It does not happen!" - You say - "Or is it a new or Starodachnoe!". Say and wrong. And promptly, and happily acknowledge their error, as soon find yourself in a wonderful oasis of luxurious simplicity, somehow magically arisen in the middle of a raging forest in the Russian epic spellcasting lake just an hour away and only a few traffic lights from the Kremlin!</p>
			<a href="#" class="meet-1">ALL INFORMATION</a>
		</div>
	</div>
<!-- about -->
<!-- news -->
	<div class="news">
		<div class="container">
			<h3>NEWS</h3>
			<div class="col-md-4 news-1 wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<img src="/template/moban334/images/img2.jpg" class="img-responsive" alt="" />
				<span class="arrow"> </span>
				<div class="news-top">
					<h6>18</h6>
					<p>june 2014</p>
				</div>
				<div class="news-bottom">
					<p>Where the Russians were resting in the summer of 2014</p>
				</div>
			</div>
			<div class="col-md-4 news-1 wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<img src="/template/moban334/images/img1.jpg" class="img-responsive" alt="" />
				<span class="arrow"> </span>
				<div class="news-top">
					<h6>18</h6>
					<p>june 2014</p>
				</div>
				<div class="news-bottom">
					<p>Where the Russians were resting in the summer of 2014</p>
				</div>
			</div>
			<div class="col-md-4 news-1 wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<img src="/template/moban334/images/img3.jpg" class="img-responsive" alt="" />
				<span class="arrow"> </span>
				<div class="news-top">
					<h6>18</h6>
					<p>june 2014</p>
				</div>
				<div class="news-bottom">
					<p>Where the Russians were resting in the summer of 2014</p>
				</div>
			</div>
				<div class="clearfix"> </div>
		</div>
	</div>
<!-- news -->
<!-- gallery -->
	<div class="gallery">
		<div class="container">
			<h3>GALLERY</h3>
				<div class="col-md-6 gallery-left">
					<img src="/template/moban334/images/img4.jpg" class="img-responsive wow bounceIn animated" data-wow-delay="0.4s" alt="" style="visibility: visible; -webkit-animation-delay: 0.4s;" />
					<div class="gallery-data">
						<h6 class="gal-h">03</h6>
						<p class="gal-p">jan 2014</p>
						<div class="clearfix"> </div>
					</div>
					<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><span> </span></a>
				<div id="small-dialog" class="mfp-hide"><!-- http://localhost/video/my/my-university-start.MP4 -->
					<iframe src="" width="" height="" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
				</div>

				</div>
				<div class="col-md-6 gallery-right">
					<div class="gallery-top">
						<img src="/template/moban334/images/img5.jpg" class="img-responsive wow bounceIn animated" data-wow-delay="0.4s" alt="" style="visibility: visible; -webkit-animation-delay: 0.4s;" />
						<div class="gallery-data">
							<h6 class="gal-h">03</h6>
							<p class="gal-p">jan 2014</p>
								<div class="clearfix"> </div>
						</div>
					</div>
					<div class="gallery-bottom">
						<img src="/template/moban334/images/img6.jpg" class="img-responsive wow bounceIn animated" data-wow-delay="0.4s" alt="" style="visibility: visible; -webkit-animation-delay: 0.4s;" />
							<div class="gallery-data">
								<h6 class="gal-h">03</h6>
								<p class="gal-p">jan 2014</p>
									<div class="clearfix"> </div>
							</div>
					</div>
				</div>
				<div class="clearfix"> </div>
		</div>
	</div>
<!-- gallery -->
	</div>
	<%@include file="common/footer.jsp" %>
</body>
</html>
