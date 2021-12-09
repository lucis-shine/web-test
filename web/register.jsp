<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页</title>
</head>
<body>
<%@include file="/header.jsp" %>
<h2>用户注册</h2>
<form action="user/register.do" onsubmit="return validateSubmit();">
    <table>
        <tr id="name" >
            <td>用户名：</td>
            <td><input type="text"  id="username" name="username" onblur="checkName();">
            <span id="havingname" ></span>
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" ></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>
                <input type="radio" name="sex" checked="checked" value="男">男
                <input type="radio" name="sex" value="女" >女
            </td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td>
                <select name="age">
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>爱好：</td>
            <td>
                <input type="checkbox" name="hobby" value="足球" >足球
                <input type="checkbox" name="hobby" value="排球" >排球
                <input type="checkbox" name="hobby" value="羽毛球" >羽毛球
                <input type="checkbox" name="hobby" value="阅读" >阅读
            </td>
        </tr>
        <tr>
        <td>备注：</td>
        <td><textarea name="remark" cols="30" rows="10"></textarea></td>
        </tr>
        <tr >
            <td colspan="2" align="center">
                <input type="submit" value="提交">
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript" src="js/normal_ajax.js"></script>
<script type="text/javascript" src="js/register.js"></script>
</html>