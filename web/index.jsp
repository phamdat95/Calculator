<%--
  Created by IntelliJ IDEA.
  User: Pham Dat
  Date: 11/29/2018
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css.css" />
  </head>
  <body>
  <div class="d0">
    <h1>Simple Calculator</h1>
    <form method="post" action="calculator">
    <div class="d1">
      <div class="d2">Calculator</div>
      <div class="d5">
        <label class="lb1">First operand:</label>
        <input class="d3" type="text" name="first">
      </div>
      <div class="d5">
        <label class="lb1">Operand :</label>
        <select class="d3" name="operand">
          <option>Addition</option>
          <option>Subtraction</option>
          <option>Multiplication</option>
          <option>Division</option>
        </select>
      </div>
      <div class="d5">
        <label class="lb1">Second operand :</label>
        <input class="d3" type="text" name="second">
      </div>
      <div class="bb">
        <button class="aa" type="submit">Calculator</button>
      </div>
    </div>
    </form>
  </div>
  </body>
</html>
