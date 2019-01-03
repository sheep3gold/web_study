package com.itcast.servlet.demo;

import com.itcast.beans.User;
import com.itcast.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String sessionCode = (String) request.getSession().getAttribute("CHECKCODE_SERVER");
        String checkCode = request.getParameter("checkCode");
        if (!sessionCode.equals(checkCode)) {
            response.getWriter().write("验证码错误");
            return;
        }
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        request.getSession().setAttribute("login", "true");
        UserService userService = new UserService();
        User user = userService.LoginTest(uname, pwd);
        if (user!=null) {
            String remember = request.getParameter("remember");
            if ("remember".equals(remember)) {
                Cookie cookie = new Cookie("username", uname);
                Cookie cookie1 = new Cookie("password", pwd);
                response.addCookie(cookie);
                response.addCookie(cookie1);
            }
            request.getSession().setAttribute("loginUser",user);
            response.sendRedirect("/jsp/demo/success.jsp");
        } else {
//            request.setAttribute("loginError", "用户名或密码错误");
//            request.getRequestDispatcher("/ErrorServlet").forward(request, response);
            response.getWriter().write("fail");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
