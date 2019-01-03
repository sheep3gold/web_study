<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello JSP</h1>
System.out.println("hello WORLD...");
<%
    System.out.println("hello java...");
    request.setAttribute("name", "张三");
%>
</body>
</html>
