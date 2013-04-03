<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login...</title>
<link href="themes/css/login.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="login">
		<div id="login_header">
			<h1 class="login_logo">
				<a href="#"><!-- <img src="themes/default/images/login_logo.gif" /> --></a>
			</h1>
			<div class="login_headerContent">
				<div class="navList">
					<ul>
						<li><a href="#">设为首页</a></li>
						<li><a href="#">反馈</a></li>
						<li><a href="#" target="_blank">帮助</a></li>
					</ul>
				</div>
				<h2 class="login_title"><!-- <img src="themes/default/images/login_title.png" /> --></h2>
			</div>
		</div>
		<div id="login_content">
			<div class="loginForm">
				<form action="./login" method="post">
					<p>
						<label>用户名：</label>
						<input type="text" name="username" size="20" class="login_input" />
					</p>
					<p>
						<label>密码：</label>
						<input type="password" name="pwd" size="20" class="login_input" />
					</p>
				<!-- 	<p>
						<label>验证码：</label>
						<input class="code" type="text" size="5" />
						<span><img src="themes/default/images/header_bg.png" alt="" width="75" height="24" /></span>
					</p> -->
					<div class="login_bar">
						<input class="sub" type="submit" value=" " />
					</div>
				</form>
			</div>
			<div class="login_banner"><!-- <img src="themes/default/images/login_banner.jpg" /> --></div>
			<div class="login_main">
				<ul class="helpList">
				</ul>
				<div class="login_inner">
				</div>
			</div>
		</div>
	</div>
</body>
</html>