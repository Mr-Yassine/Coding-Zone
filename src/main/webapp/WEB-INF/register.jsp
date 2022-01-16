<%--
  Created by IntelliJ IDEA.
  User: yassi
  Date: 16/01/2022
  Time: 01:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>

<h2>SIGN UP</h2>

<form action="<%=request.getContextPath()%>/Staff" method="post">
    <table>
        <tr>
            <td>Username:</td>
            <td>
                <label>
                    <input type="text" name="username" placeholder="Enter your username"/>
                </label>
            </td>
        </tr>
        <tr>
            <td>Email:</td>
            <td>
                <label>
                    <input type="email" name="email" placeholder="Enter your email"/>
                </label>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>
                <label>
                    <input type="password" name="password" placeholder="Enter your password"/>
                </label>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Register"/></td>
        </tr>
    </table>
</form>

</body>
</html>
