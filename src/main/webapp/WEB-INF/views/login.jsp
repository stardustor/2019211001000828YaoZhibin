<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/4/5
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
</head>
<body>
<%@include file ="header.jsp"%>
LOGIN
<%
    if(!(request.getAttribute("message")==null)){
        out.println(request.getAttribute("message"));
    }
%>
<form method ="post" action="login">
    Username:<input type="text" name="username" required><br/>
    Password:<input type="password" name="password" required><br/>
    <input type="submit" name="send data to servlet"><br/>
</form>
<%@include file="footer.jsp"%>
</body>
</html>
