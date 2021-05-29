<%--
  Created by IntelliJ IDEA.
  User: greenzombie
  Date: 5/27/21
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>login Form</title>
</head>
<body>



<h1>Welcome to the web site please log in.</h1>

<%
    if(request.getMethod().equals("POST")) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("password")) {

            response.sendRedirect("profile.jsp");
        } else {
//            response.sendRedirect("login.jsp");
            request.setAttribute("message", "Wrong User Name and Password.");
        }

    }
%>
<h1>Please Log In</h1>
<h2>${message}</h2>
<form method="POST" action="/login.jsp">

    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit" value="Log In">
</form>

<%--<c:choose>--%>
<%--    <:when test="${isAdmin = true}">--%>
<%--        --%>
<%--    </:when>--%>
<%--</c:choose>--%>


</body>
</html>
