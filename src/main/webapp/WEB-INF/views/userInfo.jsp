<%@ page import="com.YaoZhibin.model.User" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/4/12
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>
<%
/*     Cookie [] allCookies=request.getCookies();
    for(Cookie c:allCookies){
        out.println("<br/>"+c.getName()+" --- "+c.getValue());
    }*/
%>
<%
User u=(User)session.getAttribute("user");

%>

<table border="2">
    <tr>
        <td>Username</td><td><%=u.getUsername()%></td>
    </tr><tr>
        <td>Password</td><td><%=u.getPassword()%></td>
</tr><tr>
        <td>Email</td><td><%=u.getEmail()%></td>
</tr><tr>
        <td>Gender</td> <td><%=u.getGender()%></td>
</tr><tr>
        <td>Id</td><td><%=u.getId()%></td>
</tr><tr>
        <td>Birthday</td> <td><%=u.getBirthday()%></td>
    </tr>
    <tr>
    <a href="updateUser">Update User</a>
    </tr>
</table>
<%@include file="footer.jsp"%>