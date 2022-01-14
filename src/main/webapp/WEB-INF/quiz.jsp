<%--
  Created by IntelliJ IDEA.
  User: yassi
  Date: 13/01/2022
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quiz</title>
</head>
<body>

<h2>Quiz page</h2>


<form action="<%=request.getContextPath()%>/Quiz" method="post">
    <label>
        <input type="text" name="name" placeholder="Enter your name">
    </label>

    <p>What is JAVA</p>
    <label>
        <input type="radio" name="q1" value="1">
    </label>Object Oriented Programming Language<br>
    <label>
        <input type="radio" name="q1" value="2">
    </label>A programming language<br>
    <label>
        <input type="radio" name="q1" value="3">
    </label>A Script language<br>



    <p>What is HTML</p>
    <label>
        <input type="radio" name="q2" value="1">
    </label>Object Oriented Programming Language<br>
    <label>
        <input type="radio" name="q2" value="2">
    </label>A Hyper Text language<br>
    <label>
        <input type="radio" name="q2" value="3">
    </label>A Script language<br>



    <input type="submit" value="Submit">
</form>





</body>
</html>
