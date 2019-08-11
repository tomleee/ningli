<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录</title>
</head>
<body>
    <h2 align="center"><font color=red>用户登录页面</font></h2>
    <form action="success.jsp" method="post">
        <table align="center" border="1" width="2000" >
            <tr>
                <td height="100">用户名:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td height="100">密&nbsp;&nbsp;码:</td>
                <td height="100"><input type="text" name="password"></td>
            </tr>
            <tr>
                <td height="100"><input type="submit" value="登录" name="login"></td>
                <td height="100"><input type="reset" value="重置" name="reset"></td>
            </tr>
        </table>
        <p align="center"><a href="registered.jsp" color=blue>注册用户</a></p>
    </form>

    </body>
</html>