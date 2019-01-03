<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.itcast.beans.User" %><%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 8:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String str = "";
        List list = new ArrayList();
        User user = null;
        request.setAttribute("str", str);
        request.setAttribute("list", list);
        request.setAttribute("user", user);
    %>
    空字符串：${not empty str}<br>
    集合size=0:${empty list}<br>
    空对象null：${empty user}<br>
</body>
</html>
