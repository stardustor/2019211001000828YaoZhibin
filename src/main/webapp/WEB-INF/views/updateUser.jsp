<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/4/24
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1> User Update</h1>
<%
    User u= (User) session.getAttribute("user");
%>

<form method="post" action="updateUser">
    <input type="hidden" name="id" value="<%=u.getId()%>">
    username<input type="text" name="username" value="<%=u.getUsername()%>"/><br/>
    Gender:<input type="radio" name="gender" value="man"<%="man".equals(u.getGender())?"checked":""%>>Man<br/> required>man
    <input type="radio" name="gender" value="woman"<%="woman".equals(u.getGender())?"checked":""%>>Woman<br/>
    Id:<input type="text" name="id" value="<%=u.getId()%>" required><br/>
    E-mail:<input type="text" name="email" value="=<%=u.getEmail()%>" required><br/>
    Password:<input type="password" name="password" value="=<%=u.getPassword()%>"required><br/>
    Birthday:<input type="text" name="birthday" value="=<%=u.getBirthday()%>"required><br/>
</form>
<%@include file="footer.jsp"%>
