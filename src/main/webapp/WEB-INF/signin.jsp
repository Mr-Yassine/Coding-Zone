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

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


    <title>SIGN IN PAGE</title>
</head>
<body>


<div class="container">


    <div class="card">

        <div class="card-body">

            <h2 class="title">
                ENTER YOUR CODE
            </h2>

            <form action="<%=request.getContextPath()%>/Student" method="post">


                <div class="code">
                    <input class="form-control" type="text" name="1" maxlength="1"/>
                    <input class="form-control" type="text" name="2" maxlength="1"/>
                    <input class="form-control" type="text" name="3" maxlength="1"/>
                    <input class="form-control" type="text" name="4" maxlength="1"/>
                    <input class="form-control" type="text" name="5" maxlength="1"/>
                    <input class="form-control" type="text" name="6" maxlength="1"/>
                </div>


                <button id="btn" class="form-control" type="submit"> ENTER </button>


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
        width: 1241px;
        height: 647px;
        background-color: #E5E5E5;
        border-radius: 32px;
        text-align: center;
    }

    .code {
        display: inline-flex;
    }
    .form-control {
        width: 75px;
        height: 75px;
        border-radius: 14px;
        border: 0;
        text-align: center;
        background-color: #F1F1F1;
        margin: 14px;
        font-size: 48px;
        font-weight: bold;
        color: #979797;
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



</style>
</body>
</html>
