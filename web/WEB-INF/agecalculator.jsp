<%-- 
    Document   : agecalculator
    Created on : May 28, 2021, 11:41:43 AM
    Author     : 470778
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="AgeCalculator">
            <label>Enter your age:</label>
            <input type="num" name="age" value="${ageEntered}">
            <br>
            <input type="submit" value="Age Next Birthday">
            <br>
        </form>
            <span>${calculatedAge}</span>
            <br>
            <a href="ArithmeticCalculator">Arithmetic Calculator</a>
    </body>
</html>
