<%--
  Created by IntelliJ IDEA.
  User: greenzombie
  Date: 6/1/21
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ads</title>
</head>
<body>

<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${ads}">
  <div class="ad">
    <h2>${ad.id}</h2>
    <h2>${ad.userId}</h2>
    <h2>${ad.title}</h2>
    <h2>${ad.description}</h2>

  </div>
</c:forEach>

</body>
</html>
