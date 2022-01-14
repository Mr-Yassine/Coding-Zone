<%--
  Created by IntelliJ IDEA.
  User: yassine
  Date: 13/01/2022
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>


    <h2>
        <%
            String title = (String) request.getAttribute("title_var");
        %>
    </h2>


    <form action="<%=request.getContextPath()%>/Login" method="post">
        <table>
            <tr>
                <td>Username:</td>
                <td>
                    <label>
                        <input type="text" name="username" placeholder="Enter username"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>Password:</td>
                <td>
                    <label>
                        <input type="password" name="password" placeholder="Enter password"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Login"/></td>
            </tr>
        </table>
    </form>



</body>
</html>

