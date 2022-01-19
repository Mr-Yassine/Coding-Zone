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
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Login</title>
</head>
<body>

<div class="container">





    <div class="card" width="70em">
        <div class="card-body">

            <h2 class="title">
                SIGN IN
            </h2>

            <form action="<%=request.getContextPath()%>/Login" method="post">

                <label>
                    <input class="form-control" type="text" name="username" placeholder="Enter username"/>
                </label>

                <label>
                    <input class="form-control" type="password" name="password" placeholder="Enter password"/>
                </label>

                <button id="btn" class="form-control" type="submit"> LOGIN </button>
            </form>

        </div>
    </div>


</div>






<style type="text/css">

    body {
        background-color: #F1F1F1;
    }

    .container {
        margin-top: 5em;
        margin-bottom: 5em;
        text-align: center;
    }

    .title {
        font-family: unset;
        font-size: 48px;
        font-weight: bold;
        padding: 1.5em;
    }

    .card {
        margin: auto auto;
        width: 1054px;
        height: 701px;
        background-color: #FFFFFF;
        border-radius: 32px;
        text-align: center;
    }

    .form-control {
        width: 675px;
        height: 70.8px;
        border-radius: 14px;
        border: 0;
        padding-left: 1em;
        background-color: #F1F1F1;
        margin: 14px;
    }

    #btn {
        background: linear-gradient(to left, #9390FF, #6A67FB);
        border-radius: 16px;
        width: 264px;
        height: 67px;
        border: 0;
        font-family: unset;
        font-size: 26px;
        font-weight: bold;
        color: #FFFFFF;
        margin: 3em auto;
        padding-left: 0;
    }

    ::placeholder {
        font-family: unset;
        font-size: 18px;
        font-weight: 400;
    }

</style>
</body>
</html>

