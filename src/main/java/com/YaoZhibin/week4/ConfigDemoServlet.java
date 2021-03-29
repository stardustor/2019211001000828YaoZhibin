package com.YaoZhibin.week4;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/config",
        initParams = {
                @WebInitParam(name = "name", value = "YaoZhibin"),
                @WebInitParam(name = "studentid", value = "2019211001000828")
        }

)
public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String driver=getServletConfig().getInitParameter("driver");
        String url=getServletConfig().getInitParameter("url");
        String username=getServletConfig().getInitParameter("username");
        String password=getServletConfig().getInitParameter("password");
        String name=getServletConfig().getInitParameter("name");
        String studentid=getServletConfig().getInitParameter("studentid");

        PrintWriter writer= response.getWriter();
        writer.println("name:"+name);
        writer.println("studentid"+studentid);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
