package com.itcast.servlet.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ServletContextServlet")
public class ServletContextServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context1 = this.getServletContext();
        ServletContext context2 = request.getServletContext();
        ServletContext context3 = request.getSession().getServletContext();
        System.out.println(context1);
//        System.out.println(context2);
//        System.out.println(context3);
        //域对象存值，取值，移除值
        context1.setAttribute("name", "张三");
        String contextStr = (String) context1.getAttribute("name");
        context1.removeAttribute("name");
        System.out.println(contextStr);

        //获取应用名
        String contextPath = context1.getContextPath();
        System.out.println(contextPath);
        //获取全局配置参数
        String encoding = context1.getInitParameter("coding");
        System.out.println(encoding);
        //获取文件的mimeType
        String mimeType = context1.getMimeType("1.jpg");
        System.out.println(mimeType);
        //获取资源在当前项目中的位置
        String realPath = context1.getRealPath("/resource");
        System.out.println(realPath);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
