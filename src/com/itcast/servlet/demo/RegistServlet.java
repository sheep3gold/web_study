package com.itcast.servlet.demo;

import com.itcast.beans.User;
import com.itcast.service.UserService;
import org.springframework.dao.DataAccessException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/registServlet")
public class RegistServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, DataAccessException {
        request.setCharacterEncoding("UTF-8");
        String username = null;
        String password = null;
        String gender = null;
        String hobby = null;
        String birth = null;
        String city = null;
        String description = null;
        username = request.getParameter("username");
        password = request.getParameter("password");
        gender = request.getParameter("gender");
        hobby = request.getParameter("hobby");
        birth = request.getParameter("birthday");
        city = request.getParameter("city");
        description = request.getParameter("description");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = simpleDateFormat.parse(birth);
        } catch (ParseException e) {
            System.out.println("日期为空");
        }

        UserService userService = new UserService();
        User user = new User(username, password, gender, hobby, birthday, city, description);
        if (username == null || password == null) {
            return;
        }
        boolean b = userService.FindUserById(username);
        if (!b) {
            boolean b1 = userService.registUser(user);
            if (b1) {
                response.sendRedirect("/hello.html");
            }
        }else {
            response.sendRedirect("/regist.html");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
