<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        for (int i = 0; i < 10; i++) {
            response.getWriter().println("i+" + i+"<br>");
        }
    %>
</body>
</html>