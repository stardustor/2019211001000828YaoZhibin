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
User user=(User)request.getAttribute("user");

%>

<table border="2">
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Email</th>
        <th>Gender</th>
        <th>Id</th>
        <th>Birthday</th>
    </tr>
    <tr>
        <td><%=user.getUsername()%></td>
        <td><%=user.getPassword()%></td>
        <td><%=user.getEmail()%></td>
        <td><%=user.getGender()%></td>
        <td><%=user.getId()%></td>
        <td><%=user.getBirthday()%></td>
    </tr>

</table>
<%@include file="footer.jsp"%>