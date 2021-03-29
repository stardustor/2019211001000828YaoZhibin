package com.YaoZhibin.week4;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/userdb?serverTimezone=Asia/Shanghai";
        String username="root";
        String password="123456";


        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("-->"+con);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
