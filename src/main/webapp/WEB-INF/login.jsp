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


    <form action="<%=request.getContextPath()%>/login" method="post">
        <table>
            <tr>
                <td>User Name:</td>
                <td>
                    <label>
                        <input type="text" name="userName" value="<%=request.getParameter("userName")%>"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>Password:</td>
                <td>
                    <label>
                        <input type="password" name="password" value="<%=request.getParameter("password")%>"/>
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

