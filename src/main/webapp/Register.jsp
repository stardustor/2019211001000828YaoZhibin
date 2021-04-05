<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/3/15
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file ="header.jsp"%>
This is my register jsp page
<form method ="post" action="../register">
    Username:<input type="text" name="username" required><br/>
    Gender:<input type="radio" name="gender" value="man" required>man
    <input type="radio" name="gender" value="woman">woman<br/>
    Id:<input type="text" name="id" required><br/>
    E-mail:<input type="text" name="email" required><br/>
    Password:<input type="password" name="password" required><br/>
    Birthday:<input type="text" name="birthday" required><br/>
    <input type="submit" name="send data to servlet"><br/>

</form>
<%@include file="footer.jsp"%>
</body>
</html>
