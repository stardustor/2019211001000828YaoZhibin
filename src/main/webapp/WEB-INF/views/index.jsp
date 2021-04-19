<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%@include file="header.jsp"%>
<h1><%= "Hello World!yaozhibin" %>
</h1>
<h2>
    Welcome To My Online Shop Home Page
</h2>
<br/>
<form method="get" target="'blank'" action="search">
    <input type="text" name="txt" size="30"/>
    <select name="search">
    <option value="baidu">Baidu</option>
    <option value="bing">Bing</option>
    <option value="google">Google</option>
    </select>
    <input type="submit" value="Search"/>
</form>
</body>
</html>
<%@include file="footer.jsp"%>