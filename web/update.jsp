<%@ page import="VO.UserVO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改页</title>
</head>
<body>
<%@include file="/header.jsp" %>
<h2>用户修改</h2>
<%
Object obj1=request.getAttribute("userVO");
boolean woman =false;
int age=18;
boolean ZQ_check=false;
    boolean PQ_check=false;
    boolean YM_check=false;
    boolean YD_check=false;
if (obj1!=null) {
    UserVO userVO = (UserVO)obj1;
    if ("女".equals(userVO.getSEX())){
        woman=true;
    }
    age= userVO.getAGE();
    String [] hobbys=userVO.getHOBBY().split(",");
    ArrayList<String> hobbylist=new ArrayList<>();
    for (String h:hobbys){
        hobbylist.add(h);
    }
    if (hobbylist.contains("足球")){
        ZQ_check=true;
    }
    if (hobbylist.contains("排球")){
        PQ_check=true;
    }
    if (hobbylist.contains("羽毛球")){
        YM_check=true;
    }
    if (hobbylist.contains("阅读")){
        YD_check=true;
    }

}
%>
<form action="${pageContext.request.contextPath}/user/update">
    <input type="hidden" name="id" value="${userVO.ID}">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" value="${userVO.USERNAME}"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" value="${userVO.PASSWORD} " ></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>
                <input type="radio" name="sex" checked="checked"  value="男">男
                <%
                if (woman){
                %>
                <input type="radio" name="sex" checked="checked" value="女">女
                <%
                }
                else {
                %>
                <input type="radio" name="sex"   value="女">女
                <%
                }
                %>

            </td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td>
                <select name="age">
                    <%
                        for (int i =18;i<22;i++){
                            if (age==i)
                            {
                                %>
                          <option value="<%=i%>" selected="selected" ><%=i%></option>
                          <%
                            }
                            else {
                             %>
                    <option value="<%=i %>"> <%=i%></option>
                    <%
                            }
                        }
                        %>
                </select>
            </td>
        </tr>
        <tr>
            <td>爱好：</td>
            <td>
                <%
                if (ZQ_check){
                    %>
                <input type="checkbox" name="hobby" value="足球" checked="checked">足球
                <%
                }else {
                  %>
                <input type="checkbox" name="hobby" value="足球" >足球
                <%
                }
                %>
                <%
                    if (PQ_check){
                %>
                <input type="checkbox" name="hobby" value="排球" checked="checked" >排球
                <%
                }else {
                %>
                <input type="checkbox" name="hobby" value="排球" >排球
                <%
                    }
                %>
                <%
                    if (YM_check){
                %>
                <input type="checkbox" name="hobby" value="羽毛球" checked="checked" >羽毛球
                <%
                }else {
                %>
                <input type="checkbox" name="hobby" value="羽毛球" >羽毛球
                <%
                    }
                %>
                <%
                    if (YD_check){
                %>
                <input type="checkbox" name="hobby" value="阅读" checked="checked" >阅读
                <%
                }else {
                %>
                <input type="checkbox" name="hobby" value="阅读" >阅读
                <%
                    }
                %>

            </td>
        </tr>
        <tr>
        <td>备注：</td>
        <td><textarea name="remark" cols="30" rows="10">${userVO.REMARK}</textarea></td>
        </tr>
        <tr >
            <td colspan="2" align="center">
                <input type="submit" value="修改">
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>
</form>
</body>
</html>