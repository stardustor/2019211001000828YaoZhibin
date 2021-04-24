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
<%
    Cookie[] allCookies=request.getCookies();
    String username="",password="",rememberMeVal="";
    if(allCookies!=null) {
        for(Cookie c:allCookies) {
            if(c.getName().equals("cUsername"))
                username=c.getValue();
            if(c.getName().equals("cPassword"))
                password=c.getValue();
            if(c.getName().equals("cRememberMe"))
                rememberMeVal=c.getValue();
        }
    }
%>
<form method ="post" action="login">
    Username:<input type="text" name="username" value="<%=username%>" required><br/>
    Password:<input type="password" name="password" value="<%=password%>"required><br/>
    <input type="checkbox" name="rememberMe"value="1"<%=rememberMeVal.equals("1")?"checked":""%>>Remember Me<br/>
    <input type="submit" name="send data to servlet"><br/>
</form>
<%@include file="footer.jsp"%>
</body>
</html>
