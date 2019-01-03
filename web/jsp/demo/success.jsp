<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.itcast.beans.User" %><%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<%--%>
        <%--User user = (User) request.getSession().getAttribute("loginUser");--%>
        <%--String username = user.getUserName();--%>
    <%--%>--%>
<h1>首页 -- JSP页面</h1>
<%--<h3>欢迎您:<%= username %></h3>--%>
    <c:if test="${not empty loginUser}">
        <h3>欢迎您:${sessionScope.loginUser.userName}</h3>
    </c:if>
    <c:if test="${empty loginUser}">
        <h3>对不起，请先 <a href="/login.html">登陆</a></h3>
    </c:if>
</body>
</html>
