<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Map<String, String> map = new HashMap<>();
        map.put("张三", "123");
        map.put("李四", "123");
        map.put("王五", "123");
        request.setAttribute("maps", map);
    %>
<c:forEach items="${maps}" var="stuMap">
    ${stuMap.key}=${stuMap.value} <br>
</c:forEach>
</body>
</html>
