<%--
  Created by IntelliJ IDEA.
  User: yassi
  Date: 16/01/2022
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SIGN IN PAGE</title>
</head>
<body>


<h2>Hello Student!</h2>

<form action="<%=request.getContextPath()%>/Student" method="post">


    <table>
        <tr>
            <td>Student Name:</td>
            <td>
                <label>
                    <input type="text" name="name" placeholder="Enter your full name"/>
                </label>
            </td>
        </tr>
        <tr>
            <td>Code:</td>
            <td>
                <label>
                    <input type="text" name="code" placeholder="Enter your code"/>
                </label>
            </td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Sign In"/></td>
        </tr>


    </table>

</form>
</body>
</html>
