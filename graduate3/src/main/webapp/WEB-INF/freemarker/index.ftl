<!DOCTYPE html>
<html>
<head>
<title>index</title>
</head>
<body>
	<div class="reigste-or-login">
		<div class="info_list">
			<div class="email">
				<input type="text" name="username" id="username" data-info="输入邮箱地址" />
			</div>
		</div>
		<div class="info_list">
			<div class="password">
				<input type="password" name="password" id="password" data-info="输入密码" />
			</div>
		</div>
		<div class="fast_registe">
			<div class="submit_btn"><a  onclick="registe()">快速注册</a></div>
		</div>
		<div class="go_login">已有账号，<a href="/user/login">直接登录>></a></div>
	</div>
	<div class="main">
		<div class="main_left"  id="main_left">
			<div class="left_list" id="news"><a href="">新闻</a></div>
			<div class="left_list" id="public"><a href="">公共资源区</a></div>
			<div class="left_list"><a href="">其他</a></div>
		</div>
		<div class="center">
			<div id="news_content"></div>
			<div id="public_content"></div>
			<div id="other_content"></div>
		</div>
	</div>
</body>
</html>