package com.itcast.servlet.cookie;

import com.itcast.beans.User;
import com.itcast.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/LoginServlet1")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("pwd");
        UserService userService = new UserService();
        User user = userService.LoginTest(username, password);
        if (user!=null) {
            String remember = request.getParameter("remember");
            if ("remember".equals(remember)) {
                Cookie cookie = new Cookie("username", username);
                Cookie cookie1 = new Cookie("password", password);
                response.addCookie(cookie);
                response.addCookie(cookie1);
            }
            System.out.println(request.getContextPath());
            response.sendRedirect(request.getContextPath() + "/hello.html");
        }else {
            response.getWriter().write("fail");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
