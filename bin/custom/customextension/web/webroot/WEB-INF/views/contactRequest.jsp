<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/16/23
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Contact request</title>
</head>
<body>
<c:if test="${contactRequest != null}">
    Sender: ${contactRequest.sender}
    Message: ${contactRequest.message}
</c:if>

</body>
</html>
