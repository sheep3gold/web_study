<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 8:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张三丰");
        list.add("张无忌");
        request.setAttribute("list", list);
    %>
<%
    List<String> strs = (List<String>) request.getAttribute("list");
    for (String str : strs) {
        %>
    <span style="color: red"><%= str %></span>
    <%

    }
%>
</body>
</html>
