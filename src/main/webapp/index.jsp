<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>

<style>
    body{
        background-color: aliceblue;
    }
    a{
        font-size: 5.75rem;
        font-weight: 800;
        color: azure;
    }
    .ling,.meng,.kong,.jian{
        box-shadow: dimgray 7px 7px 10px;
        text-shadow: gray 1px 1px 3px;
    }

    .ling{
        display: block;
        position: absolute;
        top: 12vw;
        left: 30vw;
        text-align: center;
        width: 120px;
        height: 118px;
        background-color: cornflowerblue;
        border-top-left-radius: 30px;
    }
    .ling:hover{
        display: block;
        position: absolute;
        top: 12vw;
        left: 30vw;
        text-align: center;
        width: 128px;
        height: 126px;
        font-size: 6.75rem !important;
        background-color: cornflowerblue;
        border-top-left-radius: 30px;
    }
    .meng{
        display: block;
        position: absolute;
        top: 12.5vw;
        left: 37.2vw;
        text-align: center;
        width: 120px;
        height: 118px;
        background-color: lightpink;
        border-top-right-radius: 30px;
    }
    .meng:hover{
        display: block;
        position: absolute;
        top: 12.5vw;
        left: 37.2vw;
        text-align: center;
        width: 128px;
        height: 126px;
        font-size: 6.75rem !important;
        background-color: lightpink;
        border-top-right-radius: 30px;
    }
    .kong{
        display: block;
        position: absolute;
        top: 19.2vw;
        left: 30.8vw;
        text-align: center;
        width: 120px;
        height: 118px;
        background-color: paleturquoise;
        border-bottom-left-radius: 30px;
    }
    .kong:hover{
        display: block;
        position: absolute;
        top: 19.2vw;
        left: 30.8vw;
        text-align: center;
        width: 128px;
        height: 126px;
        font-size: 6.75rem !important;
        background-color: paleturquoise;
        border-bottom-left-radius: 30px;
    }
    .jian{
        display: block;
        position: absolute;
        top: 19.7vw;
        left: 38vw;
        text-align: center;
        width: 120px;
        height: 118px;
        background-color: peachpuff;
        border-bottom-right-radius: 30px;
    }
    .jian:hover{
        display: block;
        position: absolute;
        top: 19.7vw;
        left: 38vw;
        text-align: center;
        width: 128px;
        height: 126px;
        font-size: 6.75rem !important;
        background-color: peachpuff;
        border-bottom-right-radius: 30px;
    }
    .api{
        display: block;
        position: absolute;
        top: 9.7vw;
        left: 27vw;
        text-align: center;
        width: 780px;
        height: 330px;
        border: white solid 15px;
        border-top-right-radius: 45px;
        border-bottom-left-radius: 45px;
        box-shadow: gray 5px 5px 8px;
        z-index: -1;
        background-color: ghostwhite;
    }
    .apitext{
        position: absolute;
        font-size: 210px;
        color: khaki;
        right: 2.4vw;
        top: 1.2vw;
        text-shadow: gray 5px 5px 8px;
    }
    .apitext:hover{
        position: absolute;
        font-size: 220px;
        color: khaki;
        right: 2.1vw;
        top: 1vw;
        text-shadow: gray 5px 5px 8px;
    }
</style>

<body>
<div>
    <div class="ling"><a>岭</a></div>
    <div class="meng"><a>梦</a></div>
    <div class="kong"><a>空</a></div>
    <div class="jian"><a>间</a></div>
    <div class="api"><a class="apitext">API</a></div>
</div>
</body>
</html>
