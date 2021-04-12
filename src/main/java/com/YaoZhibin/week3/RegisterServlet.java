package com.YaoZhibin.week3;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {

       /* String driver=getServletConfig().getServletContext().getInitParameter("driver");
        String url=getServletConfig().getServletContext().getInitParameter("url");
        String username=getServletConfig().getServletContext().getInitParameter("username");
        String password=getServletConfig().getServletContext().getInitParameter("password");
        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("-->"+con);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }*/
        con = (Connection) getServletContext().getAttribute("con");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        String email =request.getParameter("email");
        String gender =request.getParameter("gender");
        String id =request.getParameter("id");
        int Id = Integer.parseInt(id);
        String birthday =request.getParameter("birthday");

        PrintWriter writer = response.getWriter();
        writer.println("<br>username:"+username);
        writer.println("<br>password:"+password);
        writer.println("<br>email:"+email);
        writer.println("<br>id:"+id);
        writer.println("<br>gender:"+gender);
        writer.println("<br>birthday:"+birthday);

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement("insert into usertable values(?,?,?,?,?,?)");
            ps.setInt(1,Id);
            ps.setString(2,username);
            ps.setString(3,password);
            ps.setString(4,email);
            ps.setString(5,gender);
            ps.setString(6,birthday);
            int res = ps.executeUpdate();
            writer.println("<table border=\"1\">\n" +
                    "  <tr>\n" +
                    "    <th>ID</th>\n" +
                    "    <th>username</th>\n" +
                    "    <th>password</th>\n" +
                    "    <th>email</th>\n" +
                    "    <th>gender</th>\n" +
                    "    <th>birthday</th>\n" +
                    "  </tr>\n" +
                    "  <tr>\n" +
                    "    <td>001</td>\n" +
                    "    <td>"+username+"</td>\n" +
                    "    <td>"+password+"</td>\n" +
                    "    <td>"+email+"</td>\n" +
                    "    <td>"+gender+"</td>\n" +
                    "    <td>"+birthday+"</td>\n" +
                    "  </tr>\n" +
                    "</table>");

          /*  ps = con.prepareStatement("select * from usertable;");
            rs = ps.executeQuery();*/

            response.sendRedirect("login.jsp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
