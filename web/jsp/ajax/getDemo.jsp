<%--
  Created by IntelliJ IDEA.
  User: yangxin
  Date: 2018/12/24
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../../resource/js/jquery-3.3.1.js"></script>
</head>
<body>
    <button onclick="ajaxGetFn();">Ajax的get请求，发送数据到后台</button>
    <button onclick="ajaxPostFn();">Ajax的post请求，发送数据到后台</button>
    <button onclick="ajaxDemoFn();">Ajax请求</button>
</body>
<script>
    function ajaxGetFn() {
        //Ajax的GET请求：
        //方式一：key=value&key=value形式传值
        // $.get("/getDemo","name='张三'&age=18",function (res) {
        //     //处理响应数据
        //     alert(res);
        // },"text");

        //方式二：{key:value,key:value}形式传值
        $.get("/GetDemoServlet", {"name": "张三", "age": 18}, function (res) {
            //处理响应数据
            alert(res);
        }, "text");
    }

    function ajaxPostFn() {
        $.post("/PostDemoServlet",{"name":"李四","age":13},function(res){
            alert(res);
        });
    }

    function ajaxDemoFn() {
        $.ajax({
            url: "/AjaxServlet",
            data:{"name":"哈哈哈", "age": 4},
            async:true,
            type:"GET",
            dataType:"text",
            success:function (succRes) {
                alert(succRes);
            },
            error:function (errorRes) {
                alert("出现异常了");
            }
        })

    }
</script>
</html>
