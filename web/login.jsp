<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页</title>
</head>
<body>
<%@include file="/header.jsp" %>
<h2>登录</h2>

<%
    String c_name="";
    String c_password="";
    Cookie[] cookies=request.getCookies();
    if (cookies!=null){
        for (Cookie cookie:cookies){
            if ("name".equals(cookie.getName())){
                c_name=cookie.getValue();
            }
            if ("password".equals(cookie.getName())){
                c_password=cookie.getValue();
            }
        }
    }

%>
<form action="doLogin" method="post">
<p>用户名：<input type="text" name="uerName" value="<%= c_name%>"></p>
<p>密码：<input type="password" name="uerPassword" value="<%= c_password %>" ></p>
<p><input type="submit" value="登录"><input type="submit" value="重置"></p>
</form>
</body>
</html>
