<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<!DOCTYPE html>
<html>
<head>
<title><decorator:title default="sitemesh" /></title>
<link rel="stylesheet" type="text/css" href="/css/desktop/css.css" />
<script type="text/javascript" src="/js/jquery-2.1.0.js"></script>
<decorator:head />
</head>
<body>
	<div class="head">
		<div class="box">
			<div class="nar">
				<div class="narl">说明文字</div>
				<div class="narr">
					<ul>
						<li><a href="">首页</a></li>
						|<li><a href="">登录</a></li>
						|<li><a href="">注册</a></li>
						|<li><a href="">其他</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="banner">
		<div class="box">
			<div class="bannerl">
				<img alt="" src="/img/bg.jpg">
			</div>
			<div class="bannerr">
				<ul>
					<li><a href="">文件上传</a></li>
					<li><a href="">文件下载</a></li>
					<li><a href="">添加组</a></li>
					<li><a href="">管理组</a></li>
				</ul>
			</div>
		</div>
	</div>
	<decorator:body />
	<hr />
	<h2>SiteMesh装饰footer</h2>
</body>
</html>
