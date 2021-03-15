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
<form>
    Username:<input type="text" name="name" required><br/>
    Gender:<input type="radio" name="gender" text="man" required>man
    <input type="radio" name="gender" text="woman">woman<br/>
    Id:<input type="text" name="id" required><br/>
    E-mail:<input type="text" name="e-mail" required><br/>
    Password:<input type="password" name="password" required><br/>
    Birthday:<input type="text" name="birthday" required><br/>
    <input type="submit" name="send data to servlet"><br/>
</form>
</body>
</html>
