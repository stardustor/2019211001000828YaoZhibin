package com.YaoZhibin.week6;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/search")
public class SearchServlet extends HttpServlet {

    Connection con = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt=request.getParameter("txt");
        String type=request.getParameter("search");
        if(txt==null) response.sendRedirect("index.jsp");
        else {
            if(type.equals("baidu"))
                response.sendRedirect("https://www.baidu.com/s?wd="+txt);
            else if(type.equals("bing"))
                response.sendRedirect("https://cn.bing.com/search?q="+txt);
            else if(type.equals("google"))
                response.sendRedirect("https://www.google.com/search?q="+txt);
        }

    }

        @Override
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

        }
    }
