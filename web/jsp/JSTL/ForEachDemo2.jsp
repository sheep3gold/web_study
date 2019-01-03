<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.itcast.beans.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<User> list = new ArrayList<>();
    User user1 = new User(1, "张三1", "123");
    User user2 = new User(2, "张三2", "123");
    User user3 = new User(3, "张三3", "123");
    list.add(user1);
    list.add(user2);
    list.add(user3);
    request.setAttribute("stus", list);
%>
<c:forEach items="${stus}" var="stu">
    ${stu.userName} <br>
</c:forEach>
</body>
</html>
