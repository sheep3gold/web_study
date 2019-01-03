package com.itcast.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",urlPatterns = {""})
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        boolean flag = false;
        if (null == request.getSession().getAttribute("login") ||
                !request.getSession().getAttribute("login").equals("true")) {
            if (cookies==null||cookies.length==0) {
                cookie=new Cookie("flag", "true");
                response.addCookie(cookie);
            }else {
                for (Cookie cookie1 : cookies) {
                    if (cookie1.getName().equals("flag")) {
                        flag = true;
                        cookie1.setValue("true");
                    }
                }
            }
            if (!flag) {
                cookie = new Cookie("flag", "true");
                response.addCookie(cookie);
            }
            System.out.println("cookie");
//            response.sendRedirect(request.getContextPath() + "/login.html");
            request.getRequestDispatcher("/" + request.getContextPath() + "/login.html").forward(request, response);
//            chain.doFilter(request, response);
        } else {
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {
//        Cookie cookie = new Cookie("flag", "true");
//        cookie.getName();
    }

}
