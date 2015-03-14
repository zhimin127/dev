<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- header -->
<header>
	<div class="header">
		<div class="container">
			<div class="head-nav">
				<span class="menu"> </span>
				<ul class="cl-effect-16">
					<li><a href="index.html" data-hover="首页">首页</a></li>
					<li><a href="projects.html" data-hover="项目案例">项目案例</a></li>
					<li><a href="houses.html" data-hover="新闻中心">新闻中心</a></li>
					<li><a href="404.html" data-hover="阳光服务">阳光服务</a></li>
					<!-- <li><a href="gallery.html"  data-hover="GALLERY">GALLERY</a></li>
						<li><a href="contact.html"  data-hover="联系我们">联系我们</a></li> -->
					<li><a href="about.html" data-hover="关于我们">关于我们</a></li>
					<!-- <div class="clearfix"> </div> -->
				</ul>
			</div>
			<!-- script-for-nav -->
			<script>
				$("span.menu").click(function() {
					$(".head-nav ul").slideToggle(300, function() {
						// Animation complete.
					});
				});
				$(function(){
					var pos = ${param.pos};
					$('.head-nav ul li:eq('+pos+')').addClass('active');
				});
			</script>
			<!-- script-for-nav -->
			<div class="header-bottom">
				<div class="head-left">
					<p>+86 176 <span>008-77-12</span></p>
				</div>
				<div class="logo">
					<a href="index.html"><img src="/template/moban334/images/logo.png" class="img-responsive" alt="" /></a>
				</div>
				<div class="head-right">
					<div class="search2">
						<form>
							<input type="text" value="YOUR QUESTION" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'YOUR QUESTION..';}">
						</form>
					</div>
				</div>
				<!-- <div class="clearfix"></div> -->
			</div>
		</div>
	</div>
</header>
<!-- header end -->