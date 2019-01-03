package com.itcast.servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ErrorServlet")
public class ErrorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<head>");
        writer.print("</head>");
        writer.print("<body>");
        String str = (String) request.getAttribute("loginError");
        writer.print("<font color='red'>" + str + "</font>");
        writer.print("<form  method='post' action='/loginServlet'>");
        writer.print("用户名：<input type='text' name='userName'> <br/>");
        writer.print("密码：<input type='password' name='password'> <br/>");
        writer.print("<input type='submit' value='登录'>");
        writer.print("</form>");
        writer.print("</body>");
        writer.print("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
