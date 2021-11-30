<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021-11-25
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
/*session.invalidate();*/
    session.removeAttribute("userLogin");
%>
<jsp:forward page="index.jsp"></jsp:forward>
</body>
</html>
