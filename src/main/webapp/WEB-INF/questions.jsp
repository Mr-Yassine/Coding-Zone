<%--
  Created by IntelliJ IDEA.
  User: yassi
  Date: 16/01/2022
  Time: 05:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questions page</title>
</head>
<body>

<!--create a form to ask the user to enter the question and tree answers and the number of correct answers-->
<form action="<%=request.getContextPath()%>/Questions" method="post">
    <label for="question">Question:</label>
    <input type="text" name="question" id="question"/>
    <br/>
    <label for="answer1">Answer 1:</label>
    <input type="text" name="answer1" id="answer1"/>
    <br/>
    <label for="answer2">Answer 2:</label>
    <input type="text" name="answer2" id="answer2"/>
    <br/>
    <label for="answer3">Answer 3:</label>
    <input type="text" name="answer3" id="answer3"/>
    <br/>
    <label for="correct">Correct answer:</label>
    <input type="number" name="correct" id="correct"/>
    <br/>
    <input type="submit" value="Submit"/>
</body>
</html>
