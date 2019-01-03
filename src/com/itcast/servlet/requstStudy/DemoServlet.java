package com.itcast.servlet.requstStudy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/DemoServlet")
public class DemoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 1. String getMethod()
         获取请求方式的类型
         * */
        String method = request.getMethod();
        System.out.println("获取请求方式的类型:" + method);
        /**
         * 2. StringBuffer getRequestURL()
         获取客户端发出请求完整URL
         * */
        StringBuffer getReqURL = request.getRequestURL();
        System.out.println("获取客户端发出请求完整URL:" + getReqURL);
        /**
         * 3. String getProtocol()
         获取当前协议的名称和版本
         * */
        String protocol = request.getProtocol();
        System.out.println("获取当前协议的名称和版本:" + protocol);
        /**
         * 4. String getRemoteAddr()
         获取IP地址
         * */
        String remoteAddr = request.getRemoteAddr();
        System.out.println("获取IP地址:" + remoteAddr);
    }
}
