<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
//        Cookie cookie = new Cookie("name", "value");
//        response.addCookie(cookie);
    %>
    从cookie中获取cookie对象:${cookie.JSESSIONID}<br>
    从cookie中获取name值：${cookie.JSESSIONID.name}<br>
    从cookie中获取value值：${cookie.JSESSIONID.value}<br>
    ${cookie.name.name}
</body>
</html>
