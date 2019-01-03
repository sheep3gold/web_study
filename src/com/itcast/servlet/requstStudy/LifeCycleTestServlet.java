package com.itcast.servlet.requstStudy;

import javax.servlet.*;
import java.io.IOException;

public class LifeCycleTestServlet implements Servlet {
    public LifeCycleTestServlet() {
        System.out.println("LifeCycleTestServlet对象被创建了...........");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init方法被调用了.............");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service方法被调用了............");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destory方法被调用了........");
    }
}
