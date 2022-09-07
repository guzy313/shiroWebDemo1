<%--
  Created by IntelliJ IDEA.
  User: GzySyq
  Date: 2022/9/6
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%> <!--支持EL表达式，不设的话，EL表达式不会解析-->
<html>
<head>
    <title>login</title>
</head>
<body>
    <form method="post" action="/login">
        用户名:<input type="text" name="userName"><br/>
        密码:<input type="password" name="password"><br/>
        <input type="submit" value="登录" >
    </form>

</body>
</html>
