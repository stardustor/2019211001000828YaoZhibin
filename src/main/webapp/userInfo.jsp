<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/4/12
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>

<table border="2">
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Email</th>
        <th>Gender</th>
        <th>Birthday</th>
    </tr>
    <tr>
        <td><%=request.getAttribute("username")%></td>
        <td><%=request.getAttribute("password")%></td>
        <td><%=request.getAttribute("email")%></td>
        <td><%=request.getAttribute("gender")%></td>
        <td><%=request.getAttribute("birthday")%></td>
    </tr>

</table>
<%@include file="footer.jsp"%>