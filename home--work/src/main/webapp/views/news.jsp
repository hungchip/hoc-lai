<%--
  Created by IntelliJ IDEA.
  User: hungchip
  Date: 10/05/2019
  Time: 8:39 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="ki_tu_bat_ki" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Danh sach</h1>
    <ki_tu_bat_ki:forEach var="bien" items="${models}">

        ${bien.title}
        ${bien.content}<br>
    </ki_tu_bat_ki:forEach>
    <style>
        h1{
            font-weight: lighter;
            font-size: 28px;
            color: goldenrod;
            position: center;
        }
    </style>
</body>
</html>
