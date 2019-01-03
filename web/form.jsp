<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/23
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="wordServlet" method="post">
    用户名：<input type="text" name="userName"><br>
    评论：<textarea name="desc"></textarea><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
