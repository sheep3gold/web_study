<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 9:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String[] strArr = new String[5];
        strArr[0] = "hello";
        strArr[1] = "world";
        strArr[2] = "传智";
        strArr[3] = "播客";
        strArr[4] = "黑马";
        request.setAttribute("strArr", strArr);
    %>
<c:forEach items="${strArr}" var="str">
    ${str}<br>
</c:forEach>
</body>
</html>
