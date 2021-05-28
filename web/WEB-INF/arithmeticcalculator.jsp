<%-- 
    Document   : arithmeticcalculator
    Created on : May 28, 2021, 12:37:20 PM
    Author     : 470778
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="ArithmeticCalculator">
            <label>First:</label>
            <input type="num" name="firstNum" value="${firstNumber}">
            <br>
            <label>Second:</label>
            <input type="num" name="secondNum" value="${secondNumber}">
            <br>
            <input type="submit" name="add" value="+">
            <input type="submit" name="sub" value="-">
            <input type="submit" name="mul" value="*">
            <input type="submit" name="mod" value="%">
            <br>
        </form>
        <span>Result: ${result}</span>
        <br>
        <a href="AgeCalculator">Age Calculator</a>
        
    </body>
</html>
