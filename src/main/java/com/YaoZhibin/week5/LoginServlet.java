package com.YaoZhibin.week5;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name ="LoginServlet",value="/login")

public class LoginServlet extends HttpServlet {
    Connection con=null;

    @Override
    public void init() throws ServletException {

        String driver=getServletConfig().getServletContext().getInitParameter("driver");
        String url=getServletConfig().getServletContext().getInitParameter("url");
        String username=getServletConfig().getServletContext().getInitParameter("username");
        String password=getServletConfig().getServletContext().getInitParameter("password");
        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("-->"+con);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        try {
            PrintWriter writer=response.getWriter();
            PreparedStatement ps = con.prepareStatement("Select * from usertable where username=? and password=?");

            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                writer.println("Login Success!!!");
                writer.println("Welcome"+username);
            }
            else writer.println("Username or Password Error!!!");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
