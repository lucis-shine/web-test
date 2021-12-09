<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021-11-25
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>header</title>
</head>
<body>

<hr>
<p>欢迎：${sessionScope.userLogin.USERNAME}</p>
<hr>

<hr>
<a href="${pageContext.request.contextPath}/index.jsp">首页</a>
<a href="${pageContext.request.contextPath}<%--<%=request.getContextPath()%>--%>/register.jsp">注册</a>
<a href="${pageContext.request.contextPath}/user/queryAll">用户列表</a>
<%
Object obj_userLogin=session.getAttribute("userLogin");
if (obj_userLogin==null){
%>
<a href="${pageContext.request.contextPath}/login.jsp">登录</a>
<%
}else {
%>
<a href="${pageContext.request.contextPath}/exit.jsp">安全退出</a>
<%
}
%>
<hr>

</body>
</html>
