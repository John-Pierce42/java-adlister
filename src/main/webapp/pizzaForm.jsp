<%--
  Created by IntelliJ IDEA.
  User: greenzombie
  Date: 5/29/21
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Place!</title>
</head>
<body>

<h1> Welcome to Pizza Place!</h1>

<div>
    <form method="POST" action="pizza-order">
        <h2>Select your Crust type.</h2>
        <input  type="radio" name="crust_type" value="Pan">Pan<br>
        <input  type="radio" name="crust_type" value="Thin">Thin<br>
        <input  type="radio" name="crust_type" value="regular">regular<br>

        <h2>Select your Sauce type.</h2>
        <input  type="radio" name="sauce_type" value="Marinara">Marinara<br>
        <input  type="radio" name="sauce_type" value="Buffalo">Buffalo<br>
        <input  type="radio" name="sauce_type" value="Pesto">Pesto<br>

        <h2>Toppings.</h2>
        <input  type="checkbox" name="toppings" value="Marinara">Peperoni<br>
        <input  type="checkbox" name="toppings" value="Buffalo">Jalapenos<br>
        <input  type="checkbox" name="toppings" value="Pesto">Cheese<br>

        <h2>Select Size.</h2>
        <input  type="radio" name="size" value="Small">Small<br>
        <input  type="radio" name="size" value="Medium">Medium<br>
        <input  type="radio" name="size" value="Large">Large<br>

        <h2>Enter the address for Pizza Delivery.</h2>
        <input type="text" name="address" placeholder="Address">

        <input type="submit" value="Place your Order">

    </form>
</div>

</body>
</html>
