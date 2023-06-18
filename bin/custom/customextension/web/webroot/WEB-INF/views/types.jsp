<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/15/23
  Time: 11:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All types</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <td>Name</td>
        <td>Strings</td>
        <td>Enum value</td>
        <td>Pairs</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${allTypesList}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>
                <c:forEach items="${item.listOfStrings}" var="string">
                    ${string}
                </c:forEach>
            </td>
            <td>${item.nonDynamicEnum}</td>
            <td>
        <c:forEach items="${item.map.entrySet()}" var="entry">
            ${entry.getKey()} ${entry.getValue()}
        </c:forEach>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
