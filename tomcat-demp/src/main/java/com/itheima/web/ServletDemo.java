package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/demo1")
public class ServletDemo implements Servlet {
private  ServletConfig config;

    public void init(ServletConfig config) throws ServletException {
        this.config=config;
        System.out.println("init...");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world~");
    }

    public String getServletInfo() {
        return "";
    }

    public void destroy() {
        System.out.println("destroy...");
    }
}
