<%@ page language="java"
    pageEncoding="UTF-8"%>
    <%@ page import="com.eshore.Restaurant,java.util.*" %>
       <% request.setCharacterEncoding("utf-8");//解决中文乱码 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查找结果</title>
</head>
<body>
<%
	List<Restaurant> res=null;
	res=(List<Restaurant>)request.getSession().getAttribute("res");
   for(int i=0;i<res.size();i++)
    {
    	out.print(res.get(i).getRes_id());
    	out.print("\n");
     }
   
// 	Restaurant res=null;
// 	res=(Restaurant)request.getSession().getAttribute("res");
//  	out.print(res.getRes_addr_city()+"   ");
//  	out.print(res.getRes_style());
//     out.print("\n");

	%>
</body>
</html>