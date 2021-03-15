package com.YaoZhibin.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Name: YaoZhibin\n" +
                "ID: 2019211001000828\n" +
                "Date and time: Mon Mar 15 07:23:33 CST 2021\n");
    }

    public void dopost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request,response);

    }
}
