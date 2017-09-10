<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证邮箱登录</title>
</head>
<body>
<fieldset>
<legend>发送邮件</legend>
<form action="/mailtest/send" method="post">
收件人：<input type = "text" name ="address"><br>
主题：<input type = "text" name ="title"><br>
正文：<textarea rows="10" name = "content"></textarea><br>
<br>
<button>发送</button>
<span>${acce }</span>
</form>
</fieldset>
</body>
</html>