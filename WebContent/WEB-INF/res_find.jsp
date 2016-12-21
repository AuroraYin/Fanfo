<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
     <% request.setCharacterEncoding("utf-8");//解决中文乱码 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>餐馆信息查询</title>
</head>
<body>
<form action="Query" method="post">
城市名：<input name="city"/><br><br>
收藏者ID：<input name="id"/><br><br>
菜系：<input name="style"/><br><br>
餐馆关键字：<input name="key"/><br><br>
<input type="submit" value="查找">
</form>

</body>
</html>