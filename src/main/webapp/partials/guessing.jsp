<%--
  Created by IntelliJ IDEA.
  User: greenzombie
  Date: 5/28/21
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Guess a a number between 1 and 3.</h1>

<form method="POST" action="/guessing.jsp">

    <label for="guessNumber">Guess Your Number 1 to 3</label>
    <input id="guessNumber" name="guess" type="text">
    <br>

    <input type="submit">
</form>

</body>
</html>
