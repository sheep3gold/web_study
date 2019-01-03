<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 8:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("requestName", "requestScope中的值");
        request.getSession().setAttribute("sessionName", "sessionScope中的值");
        request.getServletContext().setAttribute("servletContextName", "serveletContext中的值");
        pageContext.setAttribute("pageName", "page域中的值");
    %>
从request域中取值：${requestScope.requestName}
从session域中取值：${sessionScope.sessionName}
从page域中取值：${pageScope.pageName}
从application域中取值：${applicationScope.servletContextName}
</body>
</html>
