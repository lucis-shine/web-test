<%@ page import="VO.UserVO" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021-11-25
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户JSP</title>
</head>
<%
Object obj =request.getAttribute("userlist");
/*out.println(obj+"<br>");*/
%>
<body>
<%@include file="/header.jsp" %>
<table>
    <tr>
    <th>id</th>
    <th>名字</th>
    <th>密码</th>
    <th>年龄</th>
    <th>性别</th>
    <th>爱好</th>
    <th>备注</th>
    <th>操作</th>
    </tr>

    <%
        if (obj!=null){
            List<UserVO> list =( List<UserVO> )obj;
            for (UserVO vo:list){
    %>
    <tr>
        <td><%=vo.getID()%></td>
        <td><%=vo.getUSERNAME()%></td>
        <td><%=vo.getPASSWORD()%></td>
        <td><%=vo.getAGE()%></td>
        <td><%=vo.getSEX()%></td>
        <td><%=vo.getHOBBY()%></td>
        <td><%=vo.getREMARK()%></td>
        <td>
            <a href="${pageContext.request.contextPath}/user/get?id=<%=vo.getID()%>">修改</a>
            <a href="${pageContext.request.contextPath}/user/delete?id=<%=vo.getID()%>">删除</a>
        </td>
    </tr>
    <%
            }
        }
    %>
    <tr></tr>
</table>
</body>
</html>
