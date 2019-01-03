<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>El的域搜索</h2>
    <%
        pageContext.setAttribute("msg", "hello pageScope");
        request.setAttribute("msg", "hello requestScope");
        session.setAttribute("msg", "requestScope");
        application.setAttribute("msg", "applicationScope");
    %>
    域搜索: <font color="#ffc0cb">${msg}</font>
</body>
</html>
