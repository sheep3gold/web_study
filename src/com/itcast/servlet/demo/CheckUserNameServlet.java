package com.itcast.servlet.demo;

import com.alibaba.fastjson.JSON;
import com.itcast.beans.User;
import com.itcast.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/CheckUserNameServlet")
public class CheckUserNameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        UserService userService = new UserService();
        List<User> userList = userService.queryUserByName(name);
        Map<String, Object> resultMap = new HashMap<>();
        if (null != userList && userList.size() > 0) {
            resultMap.put("flag", false);
        }else {
            resultMap.put("flag", true);
        }

        //将map转换为json字符串
        String s = JSON.toJSONString(resultMap);
        System.out.println(s);
        response.getWriter().println(s);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
