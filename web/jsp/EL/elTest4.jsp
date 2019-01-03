<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/22
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("n1", "10");
        pageContext.setAttribute("n2", "20");
    %>
    加法运算：${n1+n2}<br>
    减法运算：${n1-n2}<br>
    乘法运算：${n1*n2}<br>
    除法运算：${n1/n2}或${n1 div n2}<br>
    取余运算：${n1%n2}或${n1 mod n2}<br>

==:${n1==n2} 或${n1 eq n2}
!=:${n1!=n2} 或 ${n1 ne n2}
>: ${n1>n2} 或 ${n1 gt n2}
"<": ${n1<n2}或${n1 lt n2}
<= : ${n1<=n2} 或${n1 le n2}
</body>
</html>
